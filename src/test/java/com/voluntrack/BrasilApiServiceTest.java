package com.voluntrack;

import com.voluntrack.dto.EnderecoDTO;
import com.voluntrack.service.BrasilApiService;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class BrasilApiServiceTest {

    @Test
    void deveRetornarEnderecoValidoAoConsultarCep() throws Exception {

        BrasilApiService service = new BrasilApiService();
        
        EnderecoDTO resultado = service.buscarEnderecoPorCep("70150900");

        assertNotNull(resultado, "O resultado não deveria ser nulo");
        assertEquals("DF", resultado.state(), "O estado deveria ser DF");
        assertEquals("Brasília", resultado.city(), "A cidade deveria ser Brasília");
    }
}