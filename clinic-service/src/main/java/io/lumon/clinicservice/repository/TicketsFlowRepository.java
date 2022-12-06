package io.lumon.clinicservice.repository;

import io.lumon.clinicservice.model.dto.TicketsFlowDto;

public interface TicketsFlowRepository {

    void saveTicketsFlow(TicketsFlowDto flowDto);
}
