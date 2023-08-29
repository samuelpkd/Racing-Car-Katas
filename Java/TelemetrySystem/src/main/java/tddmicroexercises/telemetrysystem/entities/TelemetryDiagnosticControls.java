package tddmicroexercises.telemetrysystem.entities;

import tddmicroexercises.telemetrysystem.entities.TelemetryClient;

public class TelemetryDiagnosticControls
{
    public static final String DiagnosticChannelConnectionString = "*111#";
    
    private final TelemetryClient telemetryClient;
    private String diagnosticInfo = "";

    public TelemetryDiagnosticControls()
        {
            telemetryClient = new TelemetryClient();
        }
        
    public String getDiagnosticInfo(){
            return diagnosticInfo;
        }
        
    public void setDiagnosticInfo(String diagnosticInfo){
        this.diagnosticInfo = diagnosticInfo;
    }


}
