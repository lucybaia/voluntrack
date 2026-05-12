package com.voluntrack.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public record EnderecoDTO(
    String cep,
    String state,
    String city,
    String neighborhood,
    String street
) {}