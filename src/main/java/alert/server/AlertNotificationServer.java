package alert.server;

import io.grpc.Server;
import io.grpc.ServerBuilder;
import alert.AlertNotificationImpl;

import java.io.IOException;

public class AlertNotificationServer {

  private Server server;

  public static void main(String[] args) throws IOException, InterruptedException {
    AlertNotificationServer alertServer = new AlertNotificationServer();
    alertServer.start();
    alertServer.blockUntilShutdown();
  }

  private void start() throws IOException {
    int port = 50053; // Set the port number for the server

    server = ServerBuilder.forPort(port)
        .addService(new AlertNotificationImpl())
        .build()
        .start();

    System.out.println("Server started, listening on port " + port);

    Runtime.getRuntime().addShutdownHook(new Thread() {
      @Override
      public void run() {
        // Use stderr here since the logger may have been reset by its JVM shutdown hook.
        System.err.println("*** Shutting down gRPC server since JVM is shutting down");
        AlertNotificationServer.this.stop();
        System.err.println("*** Server shut down");
      }
    });
  }

  private void stop() {
    if (server != null) {
      server.shutdown();
    }
  }

  private void blockUntilShutdown() throws InterruptedException {
    if (server != null) {
      server.awaitTermination();
    }
  }
}