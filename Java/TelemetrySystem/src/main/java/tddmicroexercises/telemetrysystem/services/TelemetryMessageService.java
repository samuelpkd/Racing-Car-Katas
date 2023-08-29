package tddmicroexercises.telemetrysystem.services;

public interface TelemetryMessageService {

    public void send(String message);

    public String receive();

}
