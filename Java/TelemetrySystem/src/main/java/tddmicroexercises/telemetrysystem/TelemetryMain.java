package tddmicroexercises.telemetrysystem;

import tddmicroexercises.telemetrysystem.services.TelemetryTransmissionService;
import tddmicroexercises.telemetrysystem.services.TelemetryTransmissionServiceImpl;

public class TelemetryMain {

    public static void main(String args[]) throws Exception {

        TelemetryTransmissionService telemetryTransmissionService  = new TelemetryTransmissionServiceImpl();
        telemetryTransmissionService.checkTransmission();
    }
}
