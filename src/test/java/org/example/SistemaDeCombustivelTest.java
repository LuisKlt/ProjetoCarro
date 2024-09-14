package org.example;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class SistemaDeCombustivelTest {

    @Test
    void testAbastecer() {
        SistemaDeCombustivel combustivel = new SistemaDeCombustivel();
        combustivel.setNivelDeCombustivel(10.0);
        combustivel.abastecer(15.0);
        assertEquals(25.0, combustivel.verificarNivel(), 0.01, "O nível de combustível deve ser 25.0.");
    }

    @Test
    void testNivelDeCombustivelAposAbastecimento() {
        SistemaDeCombustivel combustivel = new SistemaDeCombustivel();
        combustivel.setNivelDeCombustivel(5.0);
        combustivel.abastecer(10.0);
        assertEquals(15.0, combustivel.verificarNivel(), "O nível de combustível após o abastecimento deve ser 15.0.");
    }

    @Test
    void testLigarSistemaDeCombustivel() {
        SistemaDeCombustivel combustivel = new SistemaDeCombustivel();
        combustivel.setNivelDeCombustivel(1.0);
        assertTrue(combustivel.ligar(true), "O sistema deve ligar com nível de combustível superior a 0.5.");
    }

    @Test
    void testNaoLigarSistemaDeCombustivel() {
        SistemaDeCombustivel combustivel = new SistemaDeCombustivel();
        combustivel.setNivelDeCombustivel(0.2);
        assertFalse(combustivel.ligar(false), "O sistema não deve ligar com nível de combustível inferior a 0.5.");
    }

    @Test
    void testGetAndSetAtributosSistemaDeCombustivel() {
        SistemaDeCombustivel combustivel = new SistemaDeCombustivel();
        combustivel.setTipoCombustivel("Gasolina");
        combustivel.setMarca("Marca X");
        combustivel.setCapacidade(50.0);
        combustivel.setNivelDeCombustivel(20.0);
        combustivel.ligar(true);

        assertAll("Verificação dos atributos do sistema de combustível",
            () -> assertEquals("Gasolina", combustivel.getTipoCombustivel(), "O tipo de combustível deve ser Gasolina."),
            () -> assertEquals("Marca X", combustivel.getMarca(), "A marca deve ser Marca X."),
            () -> assertEquals(50.0, combustivel.getCapacidade(), 0.01, "A capacidade deve ser 50.0."),
            () -> assertEquals(20.0, combustivel.verificarNivel(), 0.01, "O nível de combustível deve ser 20.0."),
            () -> assertTrue(combustivel.isEstado(), "O estado deve estar ligado.")
        );
    }

    @Test
    void testSubstituirTanque() {
        SistemaDeCombustivel combustivel = new SistemaDeCombustivel();
        combustivel.substituirTanque();
        assertDoesNotThrow(() -> combustivel.substituirTanque(), "A substituição do tanque deve ser realizada sem erros.");
    }
}
