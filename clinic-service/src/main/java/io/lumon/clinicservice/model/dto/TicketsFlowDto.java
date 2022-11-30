package io.lumon.clinicservice.model.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data @AllArgsConstructor
public class TicketsFlowDto {
    private Long clinicId;
    private Long patientId;
}
