package alert.client;

import alert.AlertNotificationServiceGrpc;
import alert.RegisterRequest;
import alert.RegisterResponse;
import alert.UnregisterRequest;
import alert.UnregisterResponse;
import alert.StreamAlertsRequest;

import java.util.concurrent.TimeUnit;

import alert.AlertMessage;

import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import io.grpc.stub.StreamObserver;

public class AlertNotificationClient {

  private final ManagedChannel channel;
  private final AlertNotificationServiceGrpc.AlertNotificationServiceBlockingStub blockingStub;
  private final AlertNotificationServiceGrpc.AlertNotificationServiceStub asyncStub;

  public AlertNotificationClient(String host, int port) {
    this(ManagedChannelBuilder.forAddress(host, port).usePlaintext());
  }

  public AlertNotificationClient(ManagedChannelBuilder<?> channelBuilder) {
    channel = channelBuilder.build();
    blockingStub = AlertNotificationServiceGrpc.newBlockingStub(channel);
    asyncStub = AlertNotificationServiceGrpc.newStub(channel);
  }

  public void registerForAlerts(String contactInformation) {
    RegisterRequest request = RegisterRequest.newBuilder()
        .setContactInformation(contactInformation)
        .build();

    RegisterResponse response = blockingStub.registerForAlerts(request);
    System.out.println("Register response: " + response.getMessage());
  }

  public void unregisterForAlerts(String contactInformation) {
    UnregisterRequest request = UnregisterRequest.newBuilder()
        .setContactInformation(contactInformation)
        .build();

    UnregisterResponse response = blockingStub.unregisterForAlerts(request);
    System.out.println("Unregister response: " + response.getMessage());
  }

  public void streamAlerts(String contactInformation) {
    StreamObserver<AlertMessage> responseObserver = new StreamObserver<AlertMessage>() {
      @Override
      public void onNext(AlertMessage alertMessage) {
        // Handle the received alert message
        System.out.println("Received alert message: " + alertMessage.getContent());
      }

      @Override
      public void onError(Throwable t) {
        // Handle any errors that occur during the streaming
        System.err.println("Error occurred during streaming: " + t.getMessage());
      }

      @Override
      public void onCompleted() {
        // Handle the completion of the streaming
        System.out.println("Streaming completed");
      }
    };

    StreamObserver<StreamAlertsRequest> requestObserver = asyncStub.streamAlerts(responseObserver);
    StreamAlertsRequest request = StreamAlertsRequest.newBuilder()
        .setContactInformation(contactInformation)
        .build();

    requestObserver.onNext(request);

    // Mark the completion of the request stream
    requestObserver.onCompleted();
  }

  public void shutdown() throws InterruptedException {
    channel.shutdown().awaitTermination(5, TimeUnit.SECONDS);
  }

  public static void main(String[] args) throws InterruptedException {
    AlertNotificationClient client = new AlertNotificationClient("localhost", 50053);

    // Perform client operations
    client.registerForAlerts("user@example.com");
    client.unregisterForAlerts("user@example.com");
    client.streamAlerts("user@example.com");

    // Shutdown the client
    client.shutdown();
  }
}