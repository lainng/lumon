package io.lumon.clinicservice.service;

import io.lumon.clinicservice.model.DoctorTicket;
import io.lumon.clinicservice.model.PatientTicket;

public interface TicketService {

    PatientTicket createTicketByPatient(Long patientId);

    DoctorTicket createTicketByDoctor(Long doctorId);
}
