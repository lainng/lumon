package io.lumon.clinicservice.service;

import io.lumon.clinicservice.model.Department;
import io.lumon.clinicservice.model.dto.DepartmentDto;

import java.util.List;

public interface DepartmentService {
    Department create(DepartmentDto dto);
    List<Department> departmentsByClinic(Long id);
    Department update(DepartmentDto dto);
}

