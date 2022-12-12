package io.lumon.userservice.repository.mapper;

import io.lumon.userservice.model.Address;
import io.lumon.userservice.model.Doctor;
import org.jooq.Record;
import org.jooq.RecordMapper;
import org.springframework.stereotype.Component;

import static io.lumon.userservice.jooq.Tables.ADDRESS;
import static io.lumon.userservice.jooq.Tables.DOCTOR;

@Component
public class DoctorMapper implements RecordMapper<Record, Doctor> {

    @Override
    public Doctor map(Record record) {
        Address address = new Address();
        address.setId(record.get(ADDRESS.ID));
        address.setCity(record.get(ADDRESS.CITY));
        address.setStreet(record.get(ADDRESS.STREET));
        address.setApartment(record.get(ADDRESS.APARTMENT));

        Doctor doctor = new Doctor();
        doctor.setId(record.get(DOCTOR.ID));
        doctor.setEmail(record.get(DOCTOR.EMAIL));
        doctor.setFirstName(record.get(DOCTOR.FIRST_NAME));
        doctor.setLastName(record.get(DOCTOR.LAST_NAME));
        doctor.setMobileNumber(record.get(DOCTOR.MOBILE_NUMBER));
        doctor.setPosition(record.get(DOCTOR.POSITION));
        doctor.setAddress(address);
        return doctor;
    }
}
