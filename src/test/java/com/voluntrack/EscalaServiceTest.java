package com.voluntrack;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import com.voluntrack.service.EscalaService;
import com.voluntrack.model.Voluntariado;

public class EscalaServiceTest {

    @Test
    void testListarTurnosVagosDeveRetornarTodosNoInicio() {
        EscalaService service = new EscalaService();
        assertEquals(3, service.listarTurnosVagos().size(), 
            "Deveria iniciar com 3 turnos vagos (Manhã, Tarde, Noite).");
    }

    @Test
    void testAdicionarVoluntarioDeveRemoverTurnoDaListaDeVagos() {
        EscalaService service = new EscalaService();
        Voluntariado v = new Voluntariado("Marcela", "Manhã");
        service.adicionarVoluntario(v);

        assertFalse(service.listarTurnosVagos().contains("Manhã"), 
            "O turno da manhã não deveria mais constar como vago.");
    }

    @Test
    void testNaoDeveAceitarVoluntarioComNomeVazio() {
        assertThrows(IllegalArgumentException.class, () -> {
            new Voluntariado("", "Noite");
        }, "O sistema deve impedir o cadastro de voluntários sem nome.");
    }
}