package io.lumon.clinicservice.service;

import io.lumon.clinicservice.model.Department;
import io.lumon.clinicservice.model.dto.DepartmentDto;

import java.util.List;

public interface DepartmentService {
    Department createDepartment(DepartmentDto dto);
    List<Department> departmentsByClinicId(Long id);
}

