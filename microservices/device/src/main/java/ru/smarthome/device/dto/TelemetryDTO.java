package ru.smarthome.device.dto;

import com.fasterxml.jackson.databind.JsonNode;
import lombok.Data;

import java.util.UUID;

@Data
public class TelemetryDTO {
    private String timestamp;
    private UUID deviceId;
    private JsonNode data;
}
