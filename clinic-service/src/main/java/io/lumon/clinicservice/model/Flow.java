package io.lumon.clinicservice.model;

import io.lumon.clinicservice.type.FlowStatus;
import lombok.Data;

import java.time.OffsetDateTime;
import java.util.List;

@Data
public class Flow {
    private Long id;
    private OffsetDateTime createdAt;
    private Clinic clinic;
    private Patient patient;
    private FlowStatus status;
    private PatientTicket patientTicket;
    private List<DoctorTicket> doctorTickets;

}
