package com.voluntrack;

import java.util.Scanner;
import com.voluntrack.service.EscalaService;
import com.voluntrack.service.BrasilApiService;
import com.voluntrack.dto.EnderecoDTO;
import com.voluntrack.model.Voluntariado;

public class Main {
    public static void main(String[] args) {
        EscalaService service = new EscalaService();
        BrasilApiService apiService = new BrasilApiService();
        Scanner scanner = new Scanner(System.in);
        int opcao = 0;

        System.out.println("=== VolunTrack: Gestão de ONGs ===");

        while (opcao != 3) {
            System.out.println("\n1. Cadastrar Voluntário");
            System.out.println("2. Ver Turnos Vagos (Atenção Crítica)");
            System.out.println("3. Sair");
            System.out.print("Escolha uma opção: ");
            
            try {
                opcao = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Por favor, digite um número válido.");
                continue;
            }

            if (opcao == 1) {
                System.out.print("Nome do Voluntário: ");
                String nome = scanner.nextLine();
                System.out.print("Turno (Manhã/Tarde/Noite): ");
                String turno = scanner.nextLine();

                System.out.print("Digite o CEP para validar a região: ");
                String cep = scanner.nextLine();

                try {
                    System.out.println("Consultando localidade...");
                    EnderecoDTO endereco = apiService.buscarEnderecoPorCep(cep);
                    System.out.println("Localidade validada: " + endereco.city() + " / " + endereco.state());
                    
                    service.adicionarVoluntario(new Voluntariado(nome, turno));
                    System.out.println("Cadastrado com sucesso!");
                    
                } catch (Exception e) {

                    System.out.println("Erro na validação de endereço: " + e.getMessage());
                    System.out.println("Deseja continuar o cadastro sem validar? (s/n)");
                    if (scanner.nextLine().equalsIgnoreCase("n")) {
                        continue;
                    }
                    service.adicionarVoluntario(new Voluntariado(nome, turno));
                    System.out.println("Cadastrado (sem validação de endereço).");
                }

            } else if (opcao == 2) {
                System.out.println("Turnos que precisam de atenção: " + service.listarTurnosVagos());
            }
        }
        scanner.close();
        System.out.println("Encerrando VolunTrack...");
    }
}