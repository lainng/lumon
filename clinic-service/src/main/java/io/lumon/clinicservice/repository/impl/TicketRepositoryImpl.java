package io.lumon.clinicservice.repository.impl;

import io.lumon.clinicservice.model.DoctorTicket;
import io.lumon.clinicservice.model.PatientTicket;
import io.lumon.clinicservice.model.dto.DoctorTicketDto;
import io.lumon.clinicservice.model.dto.PatientTicketDto;
import io.lumon.clinicservice.repository.TicketRepository;
import org.springframework.stereotype.Repository;

@Repository
public class TicketRepositoryImpl implements TicketRepository {

    @Override
    public DoctorTicket saveDoctorTicket(DoctorTicketDto ticketDto) {
        return null;
    }

    @Override
    public PatientTicket savePatientTicket(PatientTicketDto ticketDto) {
        return null;
    }
}
