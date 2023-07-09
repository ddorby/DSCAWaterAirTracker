package airquality;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.sql.*;


import airquality.AQMSGrpc.AQMSImplBase;
import io.grpc.stub.StreamObserver;

public class AQMSImpl extends AQMSImplBase {

	@Override
	public void getCurrentAirQuality(SensorID request, StreamObserver<COLevels> responseObserver) {

		System.out.println("request SensorID" + request.getId());
		//super.getCurrentAirQuality(request, responseObserver);
		
		// Create the response
		COLevels response = COLevels.newBuilder().setLevels(0.0f).build();
		
		//Send the response back to the client 
		responseObserver.onNext(response);
		responseObserver.onCompleted();
		
		
	}

	/*methods to get the 
	 * Air quality history
	 */
	
	@Override
	public void getAirQualityHistory(TimeRange request, StreamObserver<AirQualityData> responseObserver) {

	    long startTime = request.getStartTimestamp();
	    long endTime = request.getEndTimestamp();
	    
	    // Retrieve air quality data within the given time range
	    List<AirQualityData> airQualityHistory = retrieveAirQualityHistory(startTime, endTime);
	    
	    // Send each data point to the client using the responseObserver
	    for (AirQualityData data : airQualityHistory) {
	        responseObserver.onNext(data);
	    }
	    
	    // Complete the response stream
	    responseObserver.onCompleted();
	}

	private List<AirQualityData> retrieveAirQualityHistory(long startTime, long endTime) {
	    List<AirQualityData> airQualityHistory = new ArrayList<>();

	    try (Connection connection = DriverManager.getConnection("jdbc:sqlite:path/to/my/database.db")) { 
	    	// Establish a connection to the SQLite database using the JDBC driver
	        // Replace "path/to/my/database.db" with the actual path to your SQLite database

	        // Prepare a SQL statement to retrieve air quality data within the given time range
	        String query = "SELECT co_levels FROM air_quality WHERE timestamp BETWEEN ? AND ?";
	        PreparedStatement statement = connection.prepareStatement(query);
	        statement.setLong(1, startTime);
	        statement.setLong(2, endTime);

	        // Execute the query  and retrieve the result set
	        ResultSet resultSet = statement.executeQuery();

	        // Iterate through the result set and create AirQualityData objects
	        while (resultSet.next()) {
	        	// Retrieve the value of "co_levels" column from the current row
	        	
	            float coLevels = resultSet.getFloat("co_levels");
	            // Create an AirQualityData object using the retrieved coLevels value
	            AirQualityData airQualityData = AirQualityData.newBuilder().setCoLevels(coLevels).build();
	           
	            // Add the created AirQualityData object to the list
	            airQualityHistory.add(airQualityData);
	        }
	    } catch (SQLException e) {
	    	// Handle any SQL exceptions that may occur during the database access
	        e.printStackTrace();
	    }

	    // Return the list of retrieved air quality data
	    return airQualityHistory;
	}
	
	/* methods to set the 
	 * Air quality thresholds 
	 * to indicate when alters need to 
	 * be send to stake holders
	 */
		
	@Override
	public void setAlertThreshold(Thresholds request, StreamObserver<SuccessStatus> responseObserver) {
	    float coThresholds = request.getCoThresholds();
	    boolean success = setCOAlertThreshold(coThresholds);

	    // Create a SuccessStatus response based on the success of setting the alert threshold
	    SuccessStatus response = SuccessStatus.newBuilder().setSuccess(success).build();

	    // Send the response back to the client
	    responseObserver.onNext(response);
	    responseObserver.onCompleted();
	}

	private boolean setCOAlertThreshold(float coThresholds) {
	    try {
	        //  set the threshold value

	        // Placeholder implementation: Check if the provided threshold is valid (e.g., greater than 0)
	        if (coThresholds > 0) {
	            // Set the CO alert threshold to 70ppm (dangerous level for CO)
	            float thresholdValue = 70.0f;
	            System.out.println("Setting CO alert threshold to: " + thresholdValue);
	            return true;
	        } else {
	            System.out.println("Invalid CO alert threshold: " + coThresholds);
	            return false;
	        }
	    } catch (Exception e) {
	        // Handle any exceptions that occur during the alert threshold setting
	        e.printStackTrace();
	        return false;
	    }
	}


}
