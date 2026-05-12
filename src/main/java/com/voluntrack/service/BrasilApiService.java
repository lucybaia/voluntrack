package com.voluntrack.service;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.voluntrack.dto.EnderecoDTO;

public class BrasilApiService {

    private final HttpClient httpClient = HttpClient.newHttpClient();
    private final ObjectMapper objectMapper = new ObjectMapper();

    public EnderecoDTO buscarEnderecoPorCep(String cep) throws Exception {

        String url = "https://brasilapi.com.br/api/cep/v1/" + cep;

        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(url))
                .GET()
                .build();

        HttpResponse<String> response = httpClient.send(request, HttpResponse.BodyHandlers.ofString());

        if (response.statusCode() == 200) {
            return objectMapper.readValue(response.body(), EnderecoDTO.class);
        } else {
            throw new RuntimeException("Erro ao buscar CEP: Status " + response.statusCode());
        }
    }
}