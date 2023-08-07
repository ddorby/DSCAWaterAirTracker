package UserGUI;

import javax.swing.*;

import airquality.Airquality;
import airquality.COLevels;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import alert.AlertNotificationServiceGrpc;
import alert.RegisterRequest;
import alert.RegisterResponse;
import alert.UnregisterRequest;
import alert.UnregisterResponse;
import alert.StreamAlertsRequest;
import alert.AlertMessage;

import waterquality.WQMSGrpc;
import waterquality.CurrentPhLevels;
import airquality.COLevels;
import waterquality.SensorId;

import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import io.grpc.stub.StreamObserver;

public class ClientGUI {

    private JTextField contactInformationField;
    private JButton registerButton;
    private JButton unregisterButton;
    private JButton streamAlertsButton;
    private JLabel registerStatusLabel;
    private JLabel unregisterStatusLabel;
    private JTextArea alertMessagesArea;
    private JTextField sensorIdField;
    private JButton getPhLevelButton;
    private JButton getCOLevelButton;
    private JLabel phLevelLabel;
    private JLabel coLevelLabel;
    private JPanel mainPanel;

    private ManagedChannel channel;
    private AlertNotificationServiceGrpc.AlertNotificationServiceBlockingStub alertBlockingStub;
    private AlertNotificationServiceGrpc.AlertNotificationServiceStub alertAsyncStub;
    private WQMSGrpc.WQMSBlockingStub waterQualityStub;

    public ClientGUI() {
        // Initialize GUI components
        mainPanel = new JPanel();
        sensorIdField = new JTextField(20);
        getPhLevelButton = new JButton("Get pH Level");
        getCOLevelButton = new JButton("Get CO Level");  
        phLevelLabel = new JLabel();
        coLevelLabel = new JLabel(); 
        contactInformationField = new JTextField(20);
        registerButton = new JButton("Register");
        unregisterButton = new JButton("Unregister");
        streamAlertsButton = new JButton("Stream Alerts");
        registerStatusLabel = new JLabel();
        unregisterStatusLabel = new JLabel();
        alertMessagesArea = new JTextArea(5, 20);

        mainPanel.add(sensorIdField);
        mainPanel.add(getPhLevelButton);
        mainPanel.add(phLevelLabel);
        mainPanel.add(getCOLevelButton);
        mainPanel.add(coLevelLabel);
        mainPanel.add(contactInformationField);
        mainPanel.add(registerButton);
        mainPanel.add(registerStatusLabel);
        mainPanel.add(unregisterButton);
        mainPanel.add(unregisterStatusLabel);
        mainPanel.add(streamAlertsButton);
        mainPanel.add(new JScrollPane(alertMessagesArea));

        // Initialize gRPC client
        channel = ManagedChannelBuilder.forAddress("localhost", 50053).usePlaintext().build();
        alertBlockingStub = AlertNotificationServiceGrpc.newBlockingStub(channel);
        alertAsyncStub = AlertNotificationServiceGrpc.newStub(channel);
        waterQualityStub = WQMSGrpc.newBlockingStub(channel);

        getPhLevelButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String sensorId = sensorIdField.getText();

                SensorId request = SensorId.newBuilder().setId(sensorId).build();
                CurrentPhLevels response = waterQualityStub.getCurrentWaterQuality(request);

                float ph = response.getPh();
                phLevelLabel.setText("Current pH level: " + ph);
            }
        });

        getCOLevelButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String sensorId = sensorIdField.getText();

                SensorId request = SensorId.newBuilder().setId(sensorId).build();
                //COLevels response = Airquality.getCOLevels(request);

                //float coLevel = response.getCOLevel();
                //coLevelLabel.setText("Current CO level: " + coLevel);
            }
        });

        registerButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                RegisterRequest request = RegisterRequest.newBuilder()
                    .setContactInformation(contactInformationField.getText())
                    .build();

                RegisterResponse response = alertBlockingStub.registerForAlerts(request);
                registerStatusLabel.setText(response.getMessage());
            }
        });

        unregisterButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                UnregisterRequest request = UnregisterRequest.newBuilder()
                    .setContactInformation(contactInformationField.getText())
                    .build();

                UnregisterResponse response = alertBlockingStub.unregisterForAlerts(request);
                unregisterStatusLabel.setText(response.getMessage());
            }
        });

        streamAlertsButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                StreamObserver<AlertMessage> responseObserver = new StreamObserver<AlertMessage>() {
                    @Override
                    public void onNext(AlertMessage alertMessage) {
                        alertMessagesArea.append(alertMessage.getContent() + "\n");
                    }

                    @Override
                    public void onError(Throwable t) {
                        alertMessagesArea.append("Error: " + t.getMessage() + "\n");
                    }

                    @Override
                    public void onCompleted() {
                        alertMessagesArea.append("Alert streaming completed.\n");
                    }
                };

                StreamObserver<StreamAlertsRequest> requestObserver = alertAsyncStub.streamAlerts(responseObserver);
                StreamAlertsRequest request = StreamAlertsRequest.newBuilder()
                    .setContactInformation(contactInformationField.getText())
                    .build();

                requestObserver.onNext(request);
                requestObserver.onCompleted();
            }
        });
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Water Quality and Alert Client");
        frame.setContentPane(new ClientGUI().mainPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
