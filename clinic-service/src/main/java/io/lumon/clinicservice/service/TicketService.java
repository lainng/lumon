package io.lumon.clinicservice.service;

import io.lumon.clinicservice.model.DoctorTicket;
import io.lumon.clinicservice.model.PatientTicket;
import io.lumon.clinicservice.model.dto.DoctorTicketDto;
import io.lumon.clinicservice.model.dto.PatientTicketDto;

public interface TicketService {

    PatientTicket createPatientTicket(PatientTicketDto ticketDto);

    DoctorTicket createDoctorTicket(DoctorTicketDto ticketDto);
}
