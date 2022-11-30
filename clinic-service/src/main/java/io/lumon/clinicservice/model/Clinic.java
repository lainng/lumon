package io.lumon.clinicservice.model;

import lombok.Data;

import java.util.List;

@Data
public class Clinic {
    private long id;
    private String title;
    private String description;
    private Doctor clinicHead;
    private List<Department> departments;
}
