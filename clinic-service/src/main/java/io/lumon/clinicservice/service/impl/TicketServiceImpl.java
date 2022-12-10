package io.lumon.clinicservice.service.impl;

import io.lumon.clinicservice.model.Doctor;
import io.lumon.clinicservice.model.DoctorTicket;
import io.lumon.clinicservice.model.PatientTicket;
import io.lumon.clinicservice.model.dto.DoctorTicketDto;
import io.lumon.clinicservice.model.dto.PatientTicketDto;
import io.lumon.clinicservice.model.dto.TicketsFlowDto;
import io.lumon.clinicservice.repository.TicketRepository;
import io.lumon.clinicservice.repository.TicketsFlowRepository;
import io.lumon.clinicservice.service.TicketService;
import io.lumon.clinicservice.service.UserClient;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class TicketServiceImpl implements TicketService {

    private final TicketRepository ticketRepository;
    private final TicketsFlowRepository flowRepository;
    private final UserClient userClient;

    public TicketServiceImpl(TicketRepository ticketRepository, TicketsFlowRepository flowRepository,
                             UserClient userClient) {
        this.ticketRepository = ticketRepository;
        this.flowRepository = flowRepository;
        this.userClient = userClient;
    }

    @Override
    @Transactional
    public PatientTicket createPatientTicket(PatientTicketDto ticketDto) {
        TicketsFlowDto flowDto = new TicketsFlowDto(
                ticketDto.getClinicId(),
                ticketDto.getPatientId());
        Long flowId = flowRepository.saveTicketsFlow(flowDto);
        ticketDto.setFlowId(flowId);
        PatientTicket patientTicket = ticketRepository.savePatientTicket(ticketDto);
        Doctor assignedDoctor = userClient.doctorById(patientTicket.getAssignedDoctor().getId());
        patientTicket.setAssignedDoctor(assignedDoctor);
        return patientTicket;
    }

    @Override
    @Transactional
    public DoctorTicket createDoctorTicket(DoctorTicketDto ticketDto) {
        return ticketRepository.saveDoctorTicket(ticketDto);
    }
}
