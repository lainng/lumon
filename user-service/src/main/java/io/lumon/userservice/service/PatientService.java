package io.lumon.userservice.service;

import io.lumon.userservice.model.Patient;
import io.lumon.userservice.model.dto.PatientDto;

public interface PatientService {
    Patient patientRegistration(PatientDto dto);
}
