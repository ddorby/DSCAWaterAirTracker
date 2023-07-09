package airquality.server;

import java.io.IOException;
import airquality.AQMSImpl;
import io.grpc.Server;
import io.grpc.ServerBuilder;

public class AirqualityServer{
	
	public static void main(String [] args) throws IOException{
		// Create a new instance of the AQMSImpl service implementation
		// Create a gRPC server on port 50051 and register the AQMSImpl service implementation
		Server s = ServerBuilder.forPort(50051).addService(new AQMSImpl()).build();
		
		// Start the server
		s.start();
		
		// Await termination of the server
		try {
			s.awaitTermination();
		}catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}