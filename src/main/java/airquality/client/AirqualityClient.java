package airquality.client;

import airquality.AQMSGrpc;
import airquality.SensorID;
import airquality.COLevels;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;

public class AirqualityClient{
	
	public static void main(String [] args) {
		// Create a channel to connect to the server
		ManagedChannel channel = ManagedChannelBuilder.forAddress("localhost", 50051).usePlaintext().build();
		
		// Create a blocking stub for making RPC calls
		AQMSGrpc.AQMSBlockingStub stub = AQMSGrpc.newBlockingStub(channel);
		
		// Prepare the request
		SensorID request = SensorID.newBuilder().setId("Sensor 1").build();
		
		//Make the RPC call to the server		
		COLevels response = stub.getCurrentAirQuality(request);
		
		// Print the response
		System.out.println("CO Levels: " + response.getLevels());
		
		// Shutdown the channel gracefully
		channel.shutdown();

	}
}