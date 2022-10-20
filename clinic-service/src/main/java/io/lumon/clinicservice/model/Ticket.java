package io.lumon.clinicservice.model;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.time.OffsetDateTime;

@Data @AllArgsConstructor
public class Ticket {
    private long id;
    private Doctor doctor;
    private OffsetDateTime createdAt;
    private OffsetDateTime ticketTime;
    private String description;
}
