package alert.client;

import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;

import javax.jmdns.JmDNS;
import javax.jmdns.ServiceEvent;
import javax.jmdns.ServiceInfo;
import javax.jmdns.ServiceListener;
import java.net.InetAddress;

public class AlertNotificationClientDiscovery {

    private AlertNotificationClient client;

    public AlertNotificationClientDiscovery() throws Exception {
        JmDNS jmdns = JmDNS.create(InetAddress.getLocalHost());

        jmdns.addServiceListener("_grpc._tcp.local.", new ServiceListener() {
            @Override
            public void serviceAdded(ServiceEvent event) {
                System.out.println("Service added: " + event.getInfo());
            }

            @Override
            public void serviceRemoved(ServiceEvent event) {
                System.out.println("Service removed: " + event.getInfo());
            }

            @Override
            public void serviceResolved(ServiceEvent event) {
                ServiceInfo info = event.getInfo();
                int port = info.getPort();
                String host = info.getHostAddresses()[0];
                client = new AlertNotificationClient(host, port);
                System.out.println("Service resolved: " + event.getInfo());
            }
        });
    }

    public AlertNotificationClient getClient() {
        return client;
    }

    public static void main(String[] args) throws Exception {
        AlertNotificationClientDiscovery discovery = new AlertNotificationClientDiscovery();
        Thread.sleep(2000); // Wait for a moment to let the service discovery finish

        // Now we can use the discovered client
        AlertNotificationClient client = discovery.getClient();
        if (client != null) {
            client.registerForAlerts("user@example.com");
            client.unregisterForAlerts("user@example.com");
            client.streamAlerts("user@example.com");
            client.shutdown();
        } else {
            System.out.println("No AlertNotificationService was discovered.");
        }
    }
}
