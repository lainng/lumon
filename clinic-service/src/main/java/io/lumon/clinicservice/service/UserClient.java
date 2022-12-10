package io.lumon.clinicservice.service;

import io.lumon.clinicservice.model.Doctor;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient("user-service")
public interface UserClient {

    @GetMapping("/doctor/{id}")
    Doctor doctorById(@PathVariable Long id);
}
