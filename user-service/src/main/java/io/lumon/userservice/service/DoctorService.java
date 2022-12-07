package io.lumon.userservice.service;

import io.lumon.userservice.model.Doctor;
import io.lumon.userservice.model.dto.DoctorDto;

public interface DoctorService {
    Doctor doctorRegistration(DoctorDto dto);
}
