package com.sampleWebsite.agenda;

import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AgendaService {

    private final AgendaRepository agendaRepository;

    public AgendaService(AgendaRepository agendaRepository) {
        this.agendaRepository = agendaRepository;
    }

    public AgendaModel saveAgenda(AgendaModel agenda) {
        return agendaRepository.save(agenda);
    }

    public List<AgendaModel> getAllAgendas() {
        return agendaRepository.findAll();
    }

    public Optional<AgendaModel> getAgendaById(Long id) {
        return agendaRepository.findById(id);
    }

    public void deleteAgendaById(Long id) {
        agendaRepository.deleteById(id);
    }
}
