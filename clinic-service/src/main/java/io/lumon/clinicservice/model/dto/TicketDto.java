package io.lumon.clinicservice.model.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.OffsetDateTime;

@Data @NoArgsConstructor
@AllArgsConstructor
public class TicketDto {
    private long doctorId;
    private OffsetDateTime createdAt;
    private OffsetDateTime ticketTime;
    private String description;
}
