package io.lumon.clinicservice.service;

import io.lumon.clinicservice.model.Clinic;

import java.util.List;

public interface ClinicService {

    Clinic clinicById(Long id);

    List<Clinic> allClinics();
}
