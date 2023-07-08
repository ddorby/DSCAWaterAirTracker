package airquality;

import airquality.AQMSGrpc.AQMSImplBase;
import io.grpc.stub.StreamObserver;

public class AQMSImpl extends AQMSImplBase {

	@Override
	public void getCurrentAirQuality(SensorID request, StreamObserver<COLevels> responseObserver) {

		System.out.println("request SensorID" + request.getId());
		//super.getCurrentAirQuality(request, responseObserver);
		
		// Create the response
		COLevels response = COLevels.newBuilder().setLevels(0.0f).build();
		
		//Send the response back to the clinet
		responseObserver.onNext(response);
		responseObserver.onCompleted();
		
		
	}

	@Override
	public void getAirQualityHistory(TimeRange request, StreamObserver<AirQualityData> responseObserver) {
		// TODO Auto-generated method stub
		super.getAirQualityHistory(request, responseObserver);
	}

	@Override
	public void setAlertThreshold(Thresholds request, StreamObserver<SuccessStatus> responseObserver) {
		// TODO Auto-generated method stub
		super.setAlertThreshold(request, responseObserver);
	}
	
	



}
