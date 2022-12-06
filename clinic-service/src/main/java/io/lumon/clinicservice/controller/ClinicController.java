package io.lumon.clinicservice.controller;

import io.lumon.clinicservice.model.Clinic;
import io.lumon.clinicservice.model.Department;
import io.lumon.clinicservice.model.dto.DepartmentDto;
import io.lumon.clinicservice.service.ClinicService;
import io.lumon.clinicservice.service.DepartmentService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/clinic")
public class ClinicController {

    private final ClinicService clinicService;
    private final DepartmentService departmentService;

    public ClinicController(ClinicService clinicService, DepartmentService departmentService) {
        this.clinicService = clinicService;
        this.departmentService = departmentService;
    }

    @GetMapping
    public ResponseEntity<List<Clinic>> allClinics() {
        return ResponseEntity.ok(clinicService.allClinics());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Clinic> clinicById(@PathVariable Long id) {
        return ResponseEntity.ok(clinicService.clinicById(id));
    }

    @GetMapping("/{id}/department")
    public ResponseEntity<List<Department>> departmentsByClinicId(@PathVariable Long id) {
        return ResponseEntity.ok(departmentService.departmentsByClinicId(id));
    }

    @PutMapping("/{id}/department")
    public ResponseEntity<Department> createDepartment(@RequestBody DepartmentDto dto, @PathVariable Long id) {
        dto.setClinicId(id);
        return ResponseEntity.ok(departmentService.createDepartment(dto));
    }
}
