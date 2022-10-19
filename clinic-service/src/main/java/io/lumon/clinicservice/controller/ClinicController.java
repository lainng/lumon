package io.lumon.clinicservice.controller;

import io.lumon.clinicservice.model.Clinic;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/clinic")
public class ClinicController {

    @GetMapping
    public List<Clinic> allClinics() {
        return List.of(new Clinic());
    }
}
