package airquality;

import java.util.HashMap;
import java.util.Map;

public class AQMSBDB {
	
	Map <String, Float> sensorAirquality; 
	
	float threshHold; 
	
	public AQMSBDB () {
		this.sensorAirquality = new HashMap<>();
		
		this.threshHold = 10;
		
		this.sensorAirquality.put("SensorID 1", 50.0f);
		//add more sensors same as above
	}
	
	float getSensorAirQuality( String senosorID) {
		
		return sensorAirquality.getOrDefault(senosorID, (float) -1);
	}
	
	void setThreshhold ( Float threshhold) {
		
		this.threshHold = threshhold;
	}

}
