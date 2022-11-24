package io.lumon.userservice.model;

import lombok.Data;

@Data
public class Address {
    private String city;
    private String street;
    private String house;
    private String flat;
}
