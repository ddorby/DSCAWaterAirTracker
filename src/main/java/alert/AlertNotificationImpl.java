package alert;

import alert.AlertNotificationServiceGrpc;
import alert.RegisterRequest;
import alert.RegisterResponse;
import alert.UnregisterRequest;
import alert.UnregisterResponse;
import alert.StreamAlertsRequest;
import alert.AlertMessage;

import io.grpc.stub.StreamObserver;

public class AlertNotificationImpl extends AlertNotificationServiceGrpc.AlertNotificationServiceImplBase {

  @Override
  public void registerForAlerts(RegisterRequest request, StreamObserver<RegisterResponse> responseObserver) {
    // TODO: Implement the logic to handle the RegisterForAlerts method
    // Retrieve the user contact information from the request and perform the necessary actions
    // ...

    // Build the RegisterResponse
    RegisterResponse response = RegisterResponse.newBuilder()
        .setMessage("Successfully registered for alerts")
        .build();

    // Send the response to the client
    responseObserver.onNext(response);
    responseObserver.onCompleted();
  }

  @Override
  public void unregisterForAlerts(UnregisterRequest request, StreamObserver<UnregisterResponse> responseObserver) {
    // TODO: Implement the logic to handle the UnregisterForAlerts method
    // Retrieve the user contact information from the request and perform the necessary actions
    // ...

    // Build the UnregisterResponse
    UnregisterResponse response = UnregisterResponse.newBuilder()
        .setMessage("Successfully unregistered from alerts")
        .build();

    // Send the response to the client
    responseObserver.onNext(response);
    responseObserver.onCompleted();
  }

  @Override
  public StreamObserver<StreamAlertsRequest> streamAlerts(StreamObserver<AlertMessage> responseObserver) {
    // TODO: Implement the logic to handle the StreamAlerts method
    // Retrieve the user contact information from the incoming stream and perform the necessary actions
    // ...

    // Create the StreamObserver to handle incoming StreamAlertsRequests
    return new StreamObserver<StreamAlertsRequest>() {
      @Override
      public void onNext(StreamAlertsRequest request) {
        // Handle the incoming request and send real-time AlertMessages to the client
        // ...
        String userContactInformation = request.getContactInformation();
        // Construct the AlertMessage
        AlertMessage alertMessage = AlertMessage.newBuilder()
            .setContent("Threshold breached: XYZ")
            .build();

        // Send the alert message to the client
        responseObserver.onNext(alertMessage);
      }

      @Override
      public void onError(Throwable t) {
        // Handle any errors that occur during the streaming
        // ...
      }

      @Override
      public void onCompleted() {
        // Handle the completion of the streaming
        // ...
        responseObserver.onCompleted();
      }
    };
  }
}