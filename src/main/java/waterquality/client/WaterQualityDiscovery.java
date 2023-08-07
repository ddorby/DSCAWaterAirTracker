package waterquality.client;

import java.net.InetAddress;

import javax.jmdns.JmDNS;
import javax.jmdns.ServiceEvent;
import javax.jmdns.ServiceListener;

import waterquality.WQMSGrpc;
import waterquality.CurrentPhLevels;
import waterquality.SensorId;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import waterquality.WQMSGrpc.WQMSBlockingStub;

public class WaterQualityDiscovery implements ServiceListener {
	
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
			SensorId request = SensorId.newBuilder().setId("SensorID 1").build();
			
			//Make the RPC call to the server		
			CurrentPhLevels response = stub.getCurrentWaterQuality(request);
			
			// Print the response
			System.out.println("PH Levels: " + response.getPh());
			
			// Shutdown the channel gracefully
			channel.shutdown();

		}
	}
	
	public static void main1 (String []  args ) throws Exception {
		
		JmDNS jmdns = JmDNS.create(InetAddress.getLocalHost());
		
		jmdns.addServiceListener("_http._tcp.local.", new WaterQualityDiscovery());
		
		// Keep the program running indefinitely
		Thread.currentThread().join();
	}


	
	public static void main (String []  args ) throws Exception {
		
		JmDNS jmdns = JmDNS.create(InetAddress.getLocalHost());
		
		jmdns.addServiceListener("_http._tcp.local.", new WaterQualityDiscovery());
		
		jmdns.wait(10000);
	}

}
