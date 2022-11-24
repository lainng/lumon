package io.lumon.userservice.model;

import lombok.Data;

@Data
public class Doctor {
    private long id;
    private String firstName;
    private String lastName;
    private String email;
    private String mobileNumber;
    private String position;
    private double experience;
    private Address address;
}
