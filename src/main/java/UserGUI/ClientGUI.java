package UserGUI;
import javax.swing.*;

import airquality.AQMSGrpc;
import airquality.AQMSGrpc.AQMSBlockingStub;
import airquality.COLevels;
import airquality.SensorID;
import airquality.SuccessStatus;
import airquality.Thresholds;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import waterquality.WQMSGrpc;
import waterquality.CurrentPhLevels;
import waterquality.SensorId;
import waterquality.SetAlertThresholdRequest;
import waterquality.SetAlertThresholdResponse;

public class ClientGUI {

    private JTextField sensorIdField;
    private JTextField minPhField;
    private JTextField maxPhField;
    private JLabel currentPhLabel;
    private JButton fetchButton;
    private JButton setThresholdButton;
    private JPanel panelMain;
    
    private WQMSGrpc.WQMSBlockingStub blockingStub;

    public void WQMSClient(String host, int port) {
        ManagedChannel managedChannel = ManagedChannelBuilder.forAddress(host, port)
                .usePlaintext()
                .build();
        blockingStub = WQMSGrpc.newBlockingStub(managedChannel);
        
        fetchButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                fetchCurrentPh();
            }
        });

        setThresholdButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                setAlertThreshold();
            }
        });
    }

    private void fetchCurrentPh() {
        SensorId sensorId = SensorId.newBuilder()
                .setId(sensorIdField.getText())
                .build();

        CurrentPhLevels phLevels = blockingStub.getCurrentWaterQuality(sensorId);

        currentPhLabel.setText(String.valueOf(phLevels.getPh()));
    }

    private void setAlertThreshold() {
        SetAlertThresholdRequest request = SetAlertThresholdRequest.newBuilder()
                .setMinPh(Float.parseFloat(minPhField.getText()))
                .setMaxPh(Float.parseFloat(maxPhField.getText()))
                .build();

        SetAlertThresholdResponse response = blockingStub.setAlertThreshold(request);

        if(response.getSuccess()){
            JOptionPane.showMessageDialog(panelMain, "Thresholds successfully set.");
        } else {
            JOptionPane.showMessageDialog(panelMain, "Failed to set thresholds.");
        }
    }
    
    // fields for air quality
    private JTextField aqSensorIdField;
    private JLabel currentCoLabel;
    private JTextField coThresholdField;
    private JButton fetchAQButton;
    private JButton setCoThresholdButton;
    
    private AQMSGrpc.AQMSBlockingStub aqBlockingStub;

    public void WQMSAQMSClient(String host, int port) {
        // existing initializations...
        
        // initialization for air quality
        aqBlockingStub = AQMSGrpc.newBlockingStub(managedChannel);

        fetchAQButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                fetchCurrentCo();
            }
        });

        setCoThresholdButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                setCoAlertThreshold();
            }
        });
    }

    private void fetchCurrentCo() {
        SensorID sensorID = SensorID.newBuilder()
                .setId(aqSensorIdField.getText())
                .build();

        COLevels coLevels = AQMSBlockingStub.getCurrentAirQuality(sensorID);

        currentCoLabel.setText(String.valueOf(coLevels.getLevels()));
    }

    private void setCoAlertThreshold() {
        Thresholds request = Thresholds.newBuilder()
                .setCoThresholds(Float.parseFloat(coThresholdField.getText()))
                .build();

        SuccessStatus response = AQMSBlockingStub.setAlertThreshold(request);

        if(response.getSuccess()){
            JOptionPane.showMessageDialog(panelMain, "CO threshold successfully set.");
        } else {
            JOptionPane.showMessageDialog(panelMain, "Failed to set CO threshold.");
        }
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Water & Air Quality Management System");
        frame.setContentPane(new WQMSClient("localhost", 50051).panelMain);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
