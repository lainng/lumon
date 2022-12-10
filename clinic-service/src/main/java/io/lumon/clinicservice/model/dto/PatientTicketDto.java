package io.lumon.clinicservice.model.dto;

import io.lumon.clinicservice.jooq.enums.TicketStatus;
import io.lumon.clinicservice.jooq.enums.TicketType;
import lombok.Data;

import java.time.OffsetDateTime;

@Data
public class PatientTicketDto {
    private Long flowId;
    private Long assignedDoctorId;
    private Long patientId;
    private Long clinicId;
    private OffsetDateTime appointmentTime;
    private String description;
    private TicketType type;
    private TicketStatus status;
}
