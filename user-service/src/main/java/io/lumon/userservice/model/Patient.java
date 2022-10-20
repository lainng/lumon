package io.lumon.userservice.model;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@EqualsAndHashCode(callSuper = true)
public class Patient extends User {

    public Patient(long id, String firstName, String lastName, String mobileNumber) {
        super(id, firstName, lastName, mobileNumber);
    }
}
