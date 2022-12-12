package io.lumon.userservice.repository;

import io.lumon.userservice.model.Doctor;

public interface DoctorRepository {
    Doctor doctorById(Long id);
}
