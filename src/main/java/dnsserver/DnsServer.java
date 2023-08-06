package dnsserver;

import javax.jmdns.JmDNS;
import javax.jmdns.ServiceInfo;
import java.net.InetAddress;

public class DnsServer {

    public static void main(String []args) throws Exception {
        JmDNS jmDNS = JmDNS.create(InetAddress.getLocalHost());

        ServiceInfo airQualityService = ServiceInfo.create("_http._tcp.local.", "airquality", 50051, "");
        jmDNS.registerService(airQualityService);
        
        ServiceInfo waterQualityService = ServiceInfo.create("_http._tcp.local.", "waterquality", 50052, "");
        jmDNS.registerService(waterQualityService);
        
        ServiceInfo alertNotificationService = ServiceInfo.create("_http._tcp.local.", "alertnotification", 50053, "");
        jmDNS.registerService(alertNotificationService);

        Thread.sleep(100000);
        jmDNS.unregisterAllServices();
    }
}
