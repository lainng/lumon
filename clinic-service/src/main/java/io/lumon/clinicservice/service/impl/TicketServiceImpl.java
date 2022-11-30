package io.lumon.clinicservice.service.impl;

import io.lumon.clinicservice.model.DoctorTicket;
import io.lumon.clinicservice.model.PatientTicket;
import io.lumon.clinicservice.service.TicketService;
import org.springframework.stereotype.Service;

@Service
public class TicketServiceImpl implements TicketService {

    @Override
    public PatientTicket createTicketByPatient(Long patientId) {
        return null;
    }

    @Override
    public DoctorTicket createTicketByDoctor(Long doctorId) {
        return null;
    }
}
