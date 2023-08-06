package waterquality.server;

import java.io.IOException;
import java.net.InetAddress;

import javax.jmdns.JmDNS;
import javax.jmdns.ServiceInfo;

import waterquality.WQMSImpl;
import io.grpc.Server;
import io.grpc.ServerBuilder;

public class WaterqualityServer{
	
	public static void main(String [] args) throws IOException{
		// Create a new instance of the AQMSImpl service implementation
		// Create a gRPC server on port 50052 and register the AQMSImpl service implementation
		Server s = ServerBuilder.forPort(50052).addService(new WQMSImpl()).build();

		JmDNS jmDNS = JmDNS.create(InetAddress.getLocalHost());

        ServiceInfo WaterQualityService = ServiceInfo.create("_http._tcp.local.", "airquality", 50052, "");
        jmDNS.registerService(WaterQualityService);

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