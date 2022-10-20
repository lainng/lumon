package io.lumon.clinicservice.model;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data @AllArgsConstructor
public class Doctor {
    private long id;
    private String firstName;
    private String lastName;

}
