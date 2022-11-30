package io.lumon.clinicservice.model;

import io.lumon.clinicservice.type.TicketStatus;
import io.lumon.clinicservice.type.TicketType;
import lombok.Data;

import java.time.OffsetDateTime;

@Data
public class DoctorTicket {
    private Long id;
    private Doctor whoMade;
    private Doctor assignedDoctor;
    private OffsetDateTime createdAt;
    private OffsetDateTime appointmentTime;
    private String description;
    private TicketType type;
    private TicketStatus status;
    private Department department;
}
