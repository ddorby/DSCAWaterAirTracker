package waterquality.client;

import java.net.InetAddress;

import javax.jmdns.JmDNS;
import javax.jmdns.ServiceEvent;
import javax.jmdns.ServiceListener;

import airquality.AQMSGrpc;
import airquality.COLevels;
import airquality.SensorID;
import airquality.client.AirQualityDiscovery;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import waterquality.WQMSGrpc;
import waterquality.WQMSGrpc.WQMSBlockingStub;

public class WaterQualityDiscovery implements ServiceListener{
	
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
		
		if (name.equals("waterquality"))
		{
			// Create a channel to connect to the server
			ManagedChannel channel = ManagedChannelBuilder.forAddress("localhost", port).usePlaintext().build();
			
			// Create a blocking stub for making RPC calls
			WQMSBlockingStub stub = WQMSGrpc.newBlockingStub(channel);
			
			// Prepare the request
			SensorID request = SensorID.newBuilder().setId("SensorID 1").build();
			
			//Make the RPC call to the server		
			COLevels response = stub.getCurrentPhLevels(request);
			
			// Print the response
			System.out.println("PH Levels: " + response.getLevels());
			
			// Shutdown the channel gracefully
			channel.shutdown();

		}
		
	}
	
	public static void main (String []  args ) throws Exception {
		
		JmDNS jmdns = JmDNS.create(InetAddress.getLocalHost());
		
		jmdns.addServiceListener("_http._tcp.local.", new WaterQualityDiscovery());
		
		jmdns.wait(10000);
	}

}
