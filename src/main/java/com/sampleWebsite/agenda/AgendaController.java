package com.sampleWebsite.agenda;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@Slf4j
@RestController
@RequestMapping("/api/agenda")
public class AgendaController {

    private final AgendaService agendaService;

    AgendaController(AgendaService agendaService) {
        this.agendaService = agendaService;
    }

    @GetMapping("/{id}")
    public Optional<AgendaModel> getAgendaById(@PathVariable Long id) {
        try {
            return agendaService.getAgendaById(id);
        } catch (RuntimeException e) {
            log.error("e: ", new AgendaNotFoundException());
            return Optional.empty();
        }

    }

    @PostMapping("/admin/newagenda")
    public AgendaModel setAgenda(@RequestBody AgendaModel agenda) {
        return agendaService.saveAgenda(agenda);
    }

    @GetMapping("/allagendas")
    public List<AgendaModel> getAllAgendas() {
        return agendaService.getAllAgendas();
    }
    @PostMapping("/admin/{id}/delete")
    public void deleteAgendaById(@PathVariable Long id) {
        agendaService.deleteAgendaById(id);
    }
}
