package tddmicroexercises.telemetrysystem.services;

import tddmicroexercises.telemetrysystem.entities.TelemetryClient;
import tddmicroexercises.telemetrysystem.entities.TelemetryDiagnosticControls;
public class TelemetryTransmissionServiceImpl implements TelemetryTransmissionService {

    TelemetryConnectionService telemetryConnectionService =  new TelemetryConnectionServiceImpl();

    TelemetryClient telemetryClient = new TelemetryClient();

    TelemetryMessageService telemetryMessageService = new TelemetryMessageServiceImpl();

    public void checkTransmission() throws Exception {

        String diagnosticInfo = "";
        telemetryConnectionService.disconnect();
        int retryLeft = 3;
        while (telemetryClient.getOnlineStatus() == false && retryLeft > 0) {
            telemetryConnectionService.connect(TelemetryDiagnosticControls.DiagnosticChannelConnectionString,false);
            retryLeft -= 1;
        }
//        if(telemetryClient.getOnlineStatus() == false)
//        {
//            throw new Exception("Unable to connect.");
//        }
        telemetryMessageService.send(TelemetryClient.DIAGNOSTIC_MESSAGE);
        diagnosticInfo = telemetryMessageService.receive();
    }
}
