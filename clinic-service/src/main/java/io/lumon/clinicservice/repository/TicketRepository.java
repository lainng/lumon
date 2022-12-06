package io.lumon.clinicservice.repository;

import io.lumon.clinicservice.model.DoctorTicket;
import io.lumon.clinicservice.model.PatientTicket;
import io.lumon.clinicservice.model.dto.DoctorTicketDto;
import io.lumon.clinicservice.model.dto.PatientTicketDto;

public interface TicketRepository {

    PatientTicket savePatientTicket(PatientTicketDto ticketDto);
    DoctorTicket saveDoctorTicket(DoctorTicketDto ticketDto);
}
