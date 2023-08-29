package tddmicroexercises.telemetrysystem.services;

import java.util.Random;

public class TelemetryConnectionServiceImpl implements TelemetryConnectionService {

    private boolean onlineStatus;

    private final Random connectionEventsSimulator = new Random(42);
    public void connect(String telemetryServerConnectionString,Boolean onlineStatus) {

        if (telemetryServerConnectionString == null || "".equals(telemetryServerConnectionString))
        {
            throw new IllegalArgumentException();
        }

        // simulate the operation on a real modem
        boolean success = connectionEventsSimulator.nextInt(10) <= 8;

        onlineStatus = success;
    }

    public void disconnect() {

        onlineStatus = false;
    }
}

