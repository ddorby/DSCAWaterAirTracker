package airquality.client;

import java.net.InetAddress;

import javax.jmdns.JmDNS;
import javax.jmdns.ServiceEvent;
import javax.jmdns.ServiceListener;

import airquality.AQMSGrpc;
import airquality.COLevels;
import airquality.SensorID;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;

public class AirQualityDiscovery implements ServiceListener {

	@Override
	public void serviceAdded(ServiceEvent event) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void serviceRemoved(ServiceEvent event) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void serviceResolved(ServiceEvent event) {
		// TODO Auto-generated method stub
		
		int port = event.getInfo().getPort();
		String name = event.getInfo().getName();
		
		if (name.equals("airquality"))
		{
			// Create a channel to connect to the server
			ManagedChannel channel = ManagedChannelBuilder.forAddress("localhost", port).usePlaintext().build();
			
			// Create a blocking stub for making RPC calls
			AQMSGrpc.AQMSBlockingStub stub = AQMSGrpc.newBlockingStub(channel);
			
			// Prepare the request
			SensorID request = SensorID.newBuilder().setId("SensorID 1").build();
			
			//Make the RPC call to the server		
			COLevels response = stub.getCurrentAirQuality(request);
			
			// Print the response
			System.out.println("CO Levels: " + response.getLevels());
			
			// Shutdown the channel gracefully
			channel.shutdown();

		}
		
	}
	
	public static void main (String []  args ) throws Exception {
		
		JmDNS jmdns = JmDNS.create(InetAddress.getLocalHost());
		
		jmdns.addServiceListener("_http._tcp.local.", new AirQualityDiscovery());
		
		jmdns.wait(10000);
	}
	
}
