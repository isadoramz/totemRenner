package application;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PesquisaTest {

    @Test
    void quandoValidarNota_ComNotaValida_NaoJogarException() throws Exception {
        // Given (Dado que)
        Pesquisa pesquisa = new Pesquisa();
        Integer nota = 5;

        // When (Quando)
        try {
            pesquisa.validarNota(nota);
        } catch(Exception e) {
            // Then (Entao)
            // Mais coisa
            fail("Teste falhou pois disparou exception");
        }
    }

    @Test
    void quandoValidarNota_ComNotaMaiorQueDez_JogarException() throws Exception {
        Pesquisa pesquisa = new Pesquisa();
        Integer nota = 11;

        Exception exception = assertThrows(Exception.class, () -> {
            pesquisa.validarNota(nota);
        });

        String expectedMessage = "A nota não pode ser maior que 10!";
        String actualMessage = exception.getMessage();

        assertTrue(actualMessage.contains(expectedMessage));
    }

    @Test
    void quandoValidarNota_ComNotaMenorQueZero_JogarException() throws Exception {
        Pesquisa pesquisa = new Pesquisa();
        Integer nota = -1;

        Exception exception = assertThrows(Exception.class, () -> {
            pesquisa.validarNota(nota);
        });

        String expectedMessage = "A nota não pode ser menor que 0!";
        String actualMessage = exception.getMessage();

        assertTrue(actualMessage.contains(expectedMessage));
    }
}