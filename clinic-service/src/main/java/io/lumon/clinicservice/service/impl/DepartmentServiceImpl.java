package io.lumon.clinicservice.service.impl;

import io.lumon.clinicservice.model.Department;
import io.lumon.clinicservice.model.dto.DepartmentDto;
import io.lumon.clinicservice.service.DepartmentService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DepartmentServiceImpl implements DepartmentService {

    @Override
    public Department update(DepartmentDto dto) {
        return null;
    }

    @Override
    public Department create(DepartmentDto dto) {
        return null;
    }

    @Override
    public List<Department> departmentsByClinic(Long id) {
        return null;
    }
}
