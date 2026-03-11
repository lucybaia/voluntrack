package com.voluntrack.model;

public class Voluntariado {
    private String nome;
    private String turno;

    public Voluntariado(String nome, String turno) {
        if (nome == null || nome.isEmpty()) {
            throw new IllegalArgumentException("Nome é obrigatório");
        }
        this.nome = nome;
        this.turno = turno;
    }

    // Adicione este método para resolver o aviso "value is not used"
    public String getNome() {
        return nome;
    }

    public String getTurno() {
        return turno;
    }
}