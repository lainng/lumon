package io.lumon.clinicservice.repository.impl;

import io.lumon.clinicservice.model.DoctorTicket;
import io.lumon.clinicservice.model.PatientTicket;
import io.lumon.clinicservice.model.dto.DoctorTicketDto;
import io.lumon.clinicservice.model.dto.PatientTicketDto;
import io.lumon.clinicservice.repository.TicketRepository;
import io.lumon.clinicservice.repository.mapper.PatientTicketMapper;
import org.jooq.DSLContext;
import org.springframework.stereotype.Repository;

import java.time.OffsetDateTime;

import static io.lumon.clinicservice.jooq.Tables.PATIENT_TICKET;

@Repository
public class TicketRepositoryImpl implements TicketRepository {
    private final DSLContext create;
    private final PatientTicketMapper patientTicketMapper;

    public TicketRepositoryImpl(DSLContext create, PatientTicketMapper patientTicketMapper) {
        this.create = create;
        this.patientTicketMapper = patientTicketMapper;
    }

    @Override
    public DoctorTicket saveDoctorTicket(DoctorTicketDto ticketDto) {
        return null;
    }

    @Override
    public PatientTicket savePatientTicket(PatientTicketDto ticketDto) {
        return create.insertInto(PATIENT_TICKET)
                .set(PATIENT_TICKET.CREATED_AT, OffsetDateTime.now())
                .set(PATIENT_TICKET.DESCRIPTION, ticketDto.getDescription())
                .set(PATIENT_TICKET.APPOINTMENT_TIME, ticketDto.getAppointmentTime())
                .set(PATIENT_TICKET.ASSIGNED_DOCTOR_ID, ticketDto.getAssignedDoctorId())
                .set(PATIENT_TICKET.FLOW_ID, ticketDto.getFlowId())
                .set(PATIENT_TICKET.TYPE, ticketDto.getType())
                .set(PATIENT_TICKET.STATUS, ticketDto.getStatus())
                .returning()
                .fetchOne()
                .map(patientTicketMapper);
    }
}
