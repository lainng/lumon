package io.lumon.clinicservice.model;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.List;

@Data
@AllArgsConstructor
public class Clinic {
    private long id;
    private String title;
    private String description;
    private int numberOfSpecialists;
    private List<String> positionsOfSpecialists;
}
