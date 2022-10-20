package io.lumon.clinicservice.controller;

import io.lumon.clinicservice.model.Clinic;
import io.lumon.clinicservice.model.Ticket;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/clinic")
public class ClinicController {

    @GetMapping
    public List<Clinic> allClinics() {
        return List.of(new Clinic(1, "LODE", "Description", 23, List.of("Doctor")));
    }

    @PostMapping("/ticket")
    public ResponseEntity<String> createTicket(@RequestBody Ticket ticket) {
        return ResponseEntity.ok("Success");
    }
}
