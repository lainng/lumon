package io.lumon.clinicservice.model.dto;

import io.lumon.clinicservice.type.TicketStatus;
import io.lumon.clinicservice.type.TicketType;
import lombok.Data;

import java.time.OffsetDateTime;

@Data
public class PatientTicketDto {
    private Long assignedDoctorId;
    private Long patientId;
    private Long clinicId;
    private OffsetDateTime createdAt;
    private OffsetDateTime appointmentTime;
    private String description;
    private TicketType type;
    private TicketStatus status;
}
