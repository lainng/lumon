package io.lumon.clinicservice.repository.impl;

import io.lumon.clinicservice.jooq.enums.FlowStatus;
import io.lumon.clinicservice.model.dto.TicketsFlowDto;
import io.lumon.clinicservice.repository.TicketsFlowRepository;
import org.jooq.DSLContext;
import org.springframework.stereotype.Repository;

import java.time.OffsetDateTime;

import static io.lumon.clinicservice.jooq.Tables.TICKETS_FLOW;

@Repository
public class TicketsFlowRepositoryImpl implements TicketsFlowRepository {
    private final DSLContext create;

    public TicketsFlowRepositoryImpl(DSLContext create) {
        this.create = create;
    }

    @Override
    public Long saveTicketsFlow(TicketsFlowDto flowDto) {
        return create.insertInto(TICKETS_FLOW)
                .set(TICKETS_FLOW.CLINIC_ID, flowDto.getClinicId())
                .set(TICKETS_FLOW.PATIENT_ID, flowDto.getPatientId())
                .set(TICKETS_FLOW.CREATED_AT, OffsetDateTime.now())
                .set(TICKETS_FLOW.STATUS, FlowStatus.OPEN)
                .returningResult(TICKETS_FLOW.ID)
                .fetchOne()
                .get(TICKETS_FLOW.ID);
    }
}
