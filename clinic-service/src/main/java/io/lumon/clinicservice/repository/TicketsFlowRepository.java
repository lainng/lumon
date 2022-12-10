package io.lumon.clinicservice.repository;

import io.lumon.clinicservice.model.dto.TicketsFlowDto;

public interface TicketsFlowRepository {

    Long saveTicketsFlow(TicketsFlowDto flowDto);
}
