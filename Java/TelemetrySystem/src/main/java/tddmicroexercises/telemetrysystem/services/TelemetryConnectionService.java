package tddmicroexercises.telemetrysystem.services;

public interface TelemetryConnectionService {
    public void connect(String telemetryServerConnectionString,Boolean onlineStatus);

    public void disconnect();
}
