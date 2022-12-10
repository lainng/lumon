package io.lumon.clinicservice.repository.mapper;

import io.lumon.clinicservice.jooq.tables.records.PatientTicketRecord;
import io.lumon.clinicservice.model.Doctor;
import io.lumon.clinicservice.model.PatientTicket;
import org.jooq.Record;
import org.jooq.RecordMapper;
import org.springframework.stereotype.Component;

import static io.lumon.clinicservice.jooq.Tables.PATIENT_TICKET;

@Component
public class PatientTicketMapper implements RecordMapper<Record, PatientTicket> {

    @Override
    public PatientTicket map(Record record) {
        PatientTicket ticket = new PatientTicket();
        ticket.setId(record.get(PATIENT_TICKET.ID));
        ticket.setType(record.get(PATIENT_TICKET.TYPE));
        ticket.setDescription(record.get(PATIENT_TICKET.DESCRIPTION));
        ticket.setStatus(record.get(PATIENT_TICKET.STATUS));
        ticket.setCreatedAt(record.get(PATIENT_TICKET.CREATED_AT));

        Doctor assignedDoctor = new Doctor();
        assignedDoctor.setId(record.get(PATIENT_TICKET.ASSIGNED_DOCTOR_ID));
        ticket.setAssignedDoctor(assignedDoctor);
        ticket.setAppointmentTime(record.get(PATIENT_TICKET.APPOINTMENT_TIME));

        return ticket;
    }
}
