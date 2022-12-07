package io.lumon.userservice.controller;

import io.lumon.userservice.model.Patient;
import io.lumon.userservice.model.dto.PatientDto;
import io.lumon.userservice.service.PatientService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/patient")
public class PatientController {

    private final PatientService patientService;

    public PatientController(PatientService patientService) {
        this.patientService = patientService;
    }

    @PutMapping
    public ResponseEntity<Patient> patientRegistration(@RequestBody PatientDto dto) {
        return ResponseEntity.ok(patientService.patientRegistration(dto));
    }

}
