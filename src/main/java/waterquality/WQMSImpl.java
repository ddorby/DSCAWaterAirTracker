package waterquality;

import com.google.protobuf.Empty;
import io.grpc.Server;
import io.grpc.ServerBuilder;
import io.grpc.stub.StreamObserver;
import waterquality.WQMSGrpc;
import waterquality.SensorId;
import waterquality.CurrentPhLevels;
import waterquality.WaterQualityHistoryResponse;
import waterquality.SetAlertThresholdRequest;
import waterquality.SetAlertThresholdResponse;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class WQMSImpl extends WQMSGrpc.WQMSImplBase {


    @Override
    public void getCurrentWaterQuality(SensorId request, StreamObserver<CurrentPhLevels> responseObserver) {
        // Get the sensor ID from the request
        String sensorId = request.getId();

        // Fetch the current pH levels based on the sensor ID
        float currentPh = fetchCurrentPhLevels(sensorId);

        // Create the response message
        CurrentPhLevels response = CurrentPhLevels.newBuilder().setPh(currentPh).build();

        // Send the response back to the client
        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }

    private float fetchCurrentPhLevels(String sensorId) {

        // For test purposes, return a random pH value between 0 and 14
        return (float) (Math.random() * 14);
    }

    /*@Override
    public void getWaterQualityHistory(WaterQualityHistoryRequest request, StreamObserver<WaterQualityHistoryResponse> responseObserver) {
        // Logic to fetch water quality history within the specified period
        long startTimestamp = request.getStartTimestamp();
        long endTimestamp = request.getEndTimestamp();

        List<WaterQualityData> waterQualityDataList = new ArrayList<>();
        // Fetch water quality data within the specified period and add them to waterQualityDataList

        // Create the response message
        WaterQualityHistoryResponse response = WaterQualityHistoryResponse.newBuilder().addAllData(waterQualityDataList).build();

        // Send the response back to the client
        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }*/

    @Override
    public void setAlertThreshold(SetAlertThresholdRequest request, StreamObserver<SetAlertThresholdResponse> responseObserver) {
        // Logic to set the pH thresholds for triggering alerts
        float minPh = request.getMinPh();
        float maxPh = request.getMaxPh();

        // Perform the necessary actions to set the thresholds

        // Create the response message
        SetAlertThresholdResponse response = SetAlertThresholdResponse.newBuilder().setSuccess(true).build();

        // Send the response back to the client
        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }
}