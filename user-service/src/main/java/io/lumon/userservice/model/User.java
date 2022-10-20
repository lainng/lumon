package io.lumon.userservice.model;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public abstract class User {
    private long id;
    private String firstName;
    private String lastName;
    private String mobileNumber;

}
