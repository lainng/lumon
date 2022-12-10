package io.lumon.clinicservice.model;

import io.lumon.clinicservice.jooq.enums.TicketStatus;
import io.lumon.clinicservice.jooq.enums.TicketType;
import lombok.Data;

import java.time.OffsetDateTime;

@Data
public class PatientTicket {
    private Long id;
    private Doctor assignedDoctor;
    private OffsetDateTime createdAt;
    private OffsetDateTime appointmentTime;
    private String description;
    private TicketType type;
    private TicketStatus status;
}
