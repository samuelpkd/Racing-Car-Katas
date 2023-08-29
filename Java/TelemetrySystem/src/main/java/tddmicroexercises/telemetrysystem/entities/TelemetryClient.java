package tddmicroexercises.telemetrysystem.entities;

import java.util.Random;

public class TelemetryClient
{
    public static final String DIAGNOSTIC_MESSAGE = "AT#UD";

    private boolean onlineStatus;
    private String diagnosticMessageResult = "";

    private final Random connectionEventsSimulator = new Random(42);

    public boolean getOnlineStatus()
    {
        return onlineStatus; 
    }



}

