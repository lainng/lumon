package io.lumon.userservice.service.impl;

import io.lumon.userservice.model.Doctor;
import io.lumon.userservice.model.dto.DoctorDto;
import io.lumon.userservice.repository.DoctorRepository;
import io.lumon.userservice.service.DoctorService;
import org.springframework.stereotype.Service;

@Service
public class DoctorServiceImpl implements DoctorService {
    private final DoctorRepository doctorRepository;

    public DoctorServiceImpl(DoctorRepository doctorRepository) {
        this.doctorRepository = doctorRepository;
    }

    @Override
    public Doctor register(DoctorDto dto) {
        return null;
    }

    @Override
    public Doctor doctorById(Long id) {
        return doctorRepository.doctorById(id);
    }
}
