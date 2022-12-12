package io.lumon.userservice.model;

import lombok.Data;

@Data
public class Address {
    private Long id;
    private String city;
    private String street;
    private String house;
    private Integer apartment;
}
