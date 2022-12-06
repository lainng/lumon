package io.lumon.clinicservice.service.impl;

import io.lumon.clinicservice.model.DoctorTicket;
import io.lumon.clinicservice.model.PatientTicket;
import io.lumon.clinicservice.model.dto.DoctorTicketDto;
import io.lumon.clinicservice.model.dto.PatientTicketDto;
import io.lumon.clinicservice.model.dto.TicketsFlowDto;
import io.lumon.clinicservice.repository.TicketRepository;
import io.lumon.clinicservice.repository.TicketsFlowRepository;
import io.lumon.clinicservice.service.TicketService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class TicketServiceImpl implements TicketService {

    private final TicketRepository ticketRepository;
    private final TicketsFlowRepository flowRepository;

    public TicketServiceImpl(TicketRepository ticketRepository, TicketsFlowRepository flowRepository) {
        this.ticketRepository = ticketRepository;
        this.flowRepository = flowRepository;
    }

    @Override
    @Transactional
    public PatientTicket createPatientTicket(PatientTicketDto ticketDto) {
        TicketsFlowDto flowDto = new TicketsFlowDto(
                ticketDto.getClinicId(),
                ticketDto.getPatientId());
        flowRepository.saveTicketsFlow(flowDto);
        return ticketRepository.savePatientTicket(ticketDto);
    }

    @Override
    @Transactional
    public DoctorTicket createDoctorTicket(DoctorTicketDto ticketDto) {
        return ticketRepository.saveDoctorTicket(ticketDto);
    }
}
