package io.lumon.clinicservice.model.dto;

import io.lumon.clinicservice.type.TicketType;
import lombok.Data;

import java.time.OffsetDateTime;

@Data
public class DoctorTicketDto {
    private Long flowId;
    private Long whoAssignedId;
    private String description;
    private TicketType type;
    private OffsetDateTime appointmentType;
}
