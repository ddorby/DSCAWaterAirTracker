package waterquality.client;

import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import waterquality.WQMSGrpc;
import waterquality.WaterQualityData;
import waterquality.SensorId;
import waterquality.CurrentPhLevels;
import waterquality.WaterQualityHistoryResponse;
import waterquality.SetAlertThresholdRequest;
import waterquality.SetAlertThresholdResponse;

public class WaterqualityClient {

    public static void main(String[] args) {
        // Create a channel to connect to the server
        ManagedChannel channel = ManagedChannelBuilder.forAddress("localhost", 50051).usePlaintext().build();

        // Create a stub for the WQMS service
        WQMSGrpc.WQMSBlockingStub stub = WQMSGrpc.newBlockingStub(channel);

        // Invoke RPC methods
        getCurrentWaterQuality(stub, "sensor1");
        setAlertThreshold(stub, 6.0f, 8.5f);

        // Shutdown the channel
        channel.shutdown();
    }

    private static void getCurrentWaterQuality(WQMSGrpc.WQMSBlockingStub stub, String sensorId) {
        // Create the request message
        SensorId request = SensorId.newBuilder().setId(sensorId).build();

        // Invoke the RPC method
        CurrentPhLevels response = stub.getCurrentWaterQuality(request);

        // Process the response
        float ph = response.getPh();
        System.out.println("Current pH level: " + ph);
        System.out.println("Sensor: " + sensorId);
    }

    /*private static void getWaterQualityHistory(WQMSGrpc.WQMSBlockingStub stub, long startTimestamp, long endTimestamp) {
        // Create the request message
        WaterQualityHistoryRequest request = WaterQualityHistoryRequest.newBuilder()
        		.setStartTimestamp(startTimestamp)
        		.setEndTimestamp(endTimestamp)
        		.build();*

        // Invoke the RPC method
        WaterQualityHistoryResponse response = stub.getWaterQualityHistory(request);

        // Process the response
        for (WaterQualityData data : response.getDataList()) {
            float ph = data.getPh();
            float turbidity = data.getTurbidity();
            float tds = data.getTds();
            float temperature = data.getTemperature();

            // Process each data point as needed
            System.out.println("pH: " + ph + ", Turbidity: " + turbidity + ", TDS: " + tds + ", Temperature: " + temperature);
        }
    }*/

    private static void setAlertThreshold(WQMSGrpc.WQMSBlockingStub stub, float minPh, float maxPh) {
        // Create the request message
        SetAlertThresholdRequest request = SetAlertThresholdRequest.newBuilder()
                .setMinPh(minPh)
                .setMaxPh(maxPh)
                .build();

        // Invoke the RPC method
        SetAlertThresholdResponse response = stub.setAlertThreshold(request);

        // Process the response
        boolean success = response.getSuccess();
        if (success) {
            System.out.println("Alert thresholds set successfully.");
        } else {
            System.out.println("Failed to set alert thresholds.");
        }
    }
}