package io.lumon.clinicservice.controller;

import io.lumon.clinicservice.model.PatientTicket;
import io.lumon.clinicservice.model.dto.PatientTicketDto;
import io.lumon.clinicservice.service.TicketService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/tickets")
public class TicketController {
    private final TicketService ticketService;

    public TicketController(TicketService ticketService) {
        this.ticketService = ticketService;
    }

    @PostMapping("/clinic/{id}")
    public ResponseEntity<PatientTicket> ticketByPatient(@PathVariable Long id, PatientTicketDto ticketDto) {
        ticketDto.setClinicId(id);
        PatientTicket patientTicket = ticketService.createPatientTicket(ticketDto);
        return ResponseEntity.ok(patientTicket);
    }
}
