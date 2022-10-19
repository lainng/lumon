package io.lumon.userservice.controller;

import io.lumon.userservice.model.Doctor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {

    @GetMapping
    public List<Doctor> allDoctors() {
        return List.of(new Doctor(1, "Alex", "Miller", "Intern", 1));
    }
}