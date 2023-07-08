package airquality.server;

import java.io.IOException;
import airquality.AQMSImpl;
import io.grpc.Server;
import io.grpc.ServerBuilder;

public class AirqualityServer{
	
	public static void main(String [] args) throws IOException{
		Server s = ServerBuilder.forPort(50051).addService(new AQMSImpl()).build();
		
		s.start();
		
		try {
			s.awaitTermination();
		}catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}