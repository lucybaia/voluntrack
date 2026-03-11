package com.voluntrack;

import java.util.Scanner;
import com.voluntrack.service.EscalaService;
import com.voluntrack.model.Voluntariado;

public class Main {
    public static void main(String[] args) {
        EscalaService service = new EscalaService();
        Scanner scanner = new Scanner(System.in);
        int opcao = 0;

        System.out.println("=== VolunTrack: Gestão de ONGs ===");

        while (opcao != 3) {
            System.out.println("\n1. Cadastrar Voluntário");
            System.out.println("2. Ver Turnos Vagos (Atenção Crítica)");
            System.out.println("3. Sair");
            System.out.print("Escolha uma opção: ");
            
            opcao = scanner.nextInt();
            scanner.nextLine(); // Limpar buffer

            if (opcao == 1) {
                System.out.print("Nome do Voluntário: ");
                String nome = scanner.nextLine();
                System.out.print("Turno (Manhã/Tarde/Noite): ");
                String turno = scanner.nextLine();
                
                try {
                    service.adicionarVoluntario(new Voluntariado(nome, turno));
                    System.out.println("Cadastrado com sucesso!");
                } catch (IllegalArgumentException e) {
                    System.out.println("Erro: " + e.getMessage());
                }

            } else if (opcao == 2) {
                System.out.println("Turnos que precisam de atenção: " + service.listarTurnosVagos());
            }
        }
        scanner.close();
    }
}