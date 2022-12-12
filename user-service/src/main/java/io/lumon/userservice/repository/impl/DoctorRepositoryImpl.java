package io.lumon.userservice.repository.impl;

import io.lumon.userservice.model.Doctor;
import io.lumon.userservice.repository.DoctorRepository;
import io.lumon.userservice.repository.mapper.DoctorMapper;
import org.jooq.DSLContext;
import org.springframework.stereotype.Repository;

import static io.lumon.userservice.jooq.Tables.ADDRESS;
import static io.lumon.userservice.jooq.Tables.DOCTOR;

@Repository
public class DoctorRepositoryImpl implements DoctorRepository {
    private final DSLContext create;
    private final DoctorMapper doctorMapper;

    public DoctorRepositoryImpl(DSLContext create, DoctorMapper doctorMapper) {
        this.create = create;
        this.doctorMapper = doctorMapper;
    }

    @Override
    public Doctor doctorById(Long id) {
        return create.select(DOCTOR.ID, DOCTOR.FIRST_NAME, DOCTOR.LAST_NAME,
                        DOCTOR.EMAIL, DOCTOR.MOBILE_NUMBER, DOCTOR.POSITION,
                        ADDRESS.ID, ADDRESS.CITY, ADDRESS.STREET, ADDRESS.HOUSE,
                        ADDRESS.APARTMENT)
                .from(DOCTOR)
                .join(ADDRESS).on(DOCTOR.ADDRESS_ID.eq(ADDRESS.ID))
                .fetchOne()
                .map(doctorMapper);
    }
}
