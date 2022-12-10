package io.lumon.userservice.controller;

import io.lumon.userservice.model.Doctor;
import io.lumon.userservice.model.dto.DoctorDto;
import io.lumon.userservice.service.DoctorService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/doctor")
public class DoctorController {

    private final DoctorService doctorService;

    public DoctorController(DoctorService doctorService) {
        this.doctorService = doctorService;
    }

    @PutMapping
    public ResponseEntity<Doctor> doctorRegistration(@RequestBody DoctorDto dto) {
        return ResponseEntity.ok(doctorService.register(dto));
    }

    @GetMapping("/{id}")
    public ResponseEntity<Doctor> doctorById(@PathVariable Long id) {
        return ResponseEntity.ok(doctorService.takeById(id));
    }
}