package com.voluntrack.service;

import java.util.ArrayList;
import java.util.List;
import com.voluntrack.model.Voluntariado;

public class EscalaService {
    private List<Voluntariado> voluntarios = new ArrayList<>();

    public void adicionarVoluntario(Voluntariado v) {
        voluntarios.add(v);
    }

    public List<String> listarTurnosVagos() {
        List<String> turnos = new ArrayList<>(List.of("Manhã", "Tarde", "Noite"));
        for (Voluntariado v : voluntarios) {
            turnos.remove(v.getTurno());
        }
        return turnos;
    }
}