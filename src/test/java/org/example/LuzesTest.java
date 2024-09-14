package org.example;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class LuzesTest {

    @Test
    void testLigarLuzes() {
        Luzes luzes = new Luzes();
        luzes.ligar();
        assertTrue(luzes.isEstado(), "As luzes devem estar ligadas.");
    }

    @Test
    void testDesligarLuzes() {
        Luzes luzes = new Luzes();
        luzes.desligar();
        assertFalse(luzes.isEstado(), "As luzes devem estar desligadas.");
    }

    @Test
    void testAjustarIntensidade() {
        Luzes luzes = new Luzes();
        luzes.ajustarIntensidade(80);
        assertEquals(80, luzes.getIntensidade(), "A intensidade das luzes deve ser 80.");
    }

    @Test
    void testGetAndSetAtributos() {
        Luzes luzes = new Luzes();
        luzes.setTipo("LED");
        luzes.setCor("Branca");
        luzes.setModelo("Modelo A");

        assertAll("Verificação dos atributos das luzes",
            () -> assertEquals("LED", luzes.getTipo(), "O tipo deve ser LED"),
            () -> assertEquals("Branca", luzes.getCor(), "A cor deve ser Branca"),
            () -> assertEquals("Modelo A", luzes.getModelo(), "O modelo deve ser Modelo A")
        );
    }

    @Test
    void testEstadoInicialDesligado() {
        Luzes luzes = new Luzes();
        assertFalse(luzes.isEstado(), "As luzes devem estar desligadas inicialmente.");
    }

    @Test
    void testAlterarEstadoDuasVezes() {
        Luzes luzes = new Luzes();
        luzes.ligar();
        assertTrue(luzes.isEstado(), "As luzes devem estar ligadas após o comando ligar.");

        luzes.desligar();
        assertFalse(luzes.isEstado(), "As luzes devem estar desligadas após o comando desligar.");
    }
}
