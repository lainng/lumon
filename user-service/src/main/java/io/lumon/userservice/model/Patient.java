package io.lumon.userservice.model;

import lombok.Data;

@Data
public class Patient {
    private long id;
    private String firstName;
    private String lastName;
    private String email;
    private String mobileNumber;
    private Address address;
}
