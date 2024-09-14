package org.example;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class SistemaDeTransmissaoTest {

    @Test
    void testTrocarMarcha() {
        SistemaDeTransmissao transmissao = new SistemaDeTransmissao();
        transmissao.trocarMarcha(3);
        assertEquals(3, transmissao.getMarcha(), "A marcha deve ser 3.");
    }

    @Test
    void testVerificarEstadoLigado() {
        SistemaDeTransmissao transmissao = new SistemaDeTransmissao();
        transmissao.setEstado(true);
        assertTrue(transmissao.verificarEstado(), "O estado da transmissão deve ser ligado.");
    }

    @Test
    void testVerificarEstadoDesligado() {
        SistemaDeTransmissao transmissao = new SistemaDeTransmissao();
        transmissao.setEstado(false);
        assertFalse(transmissao.verificarEstado(), "O estado da transmissão deve ser desligado.");
    }

    @Test
    void testSubstituirComponente() {
        SistemaDeTransmissao transmissao = new SistemaDeTransmissao();
        assertDoesNotThrow(() -> transmissao.substituirComponente("Embreagem"), "A substituição do componente 'Embreagem' deve ser realizada sem erros.");
    }

    @Test
    void testGetAndSetAtributosTransmissao() {
        SistemaDeTransmissao transmissao = new SistemaDeTransmissao();
        transmissao.setTipo("Manual");
        transmissao.setMaterial("Aço");
        transmissao.setMarca("Marca Z");
        transmissao.setNumeroDeMarchas(6);
        transmissao.setEstado(true);

        assertAll("Verificação dos atributos do sistema de transmissão",
            () -> assertEquals("Manual", transmissao.getTipo(), "O tipo da transmissão deve ser Manual."),
            () -> assertEquals("Aço", transmissao.getMaterial(), "O material da transmissão deve ser Aço."),
            () -> assertEquals("Marca Z", transmissao.getMarca(), "A marca da transmissão deve ser 'Marca Z'."),
            () -> assertEquals(6, transmissao.getNumeroDeMarchas(), "O número de marchas deve ser 6."),
            () -> assertTrue(transmissao.verificarEstado(), "O estado da transmissão deve ser ligado.")
        );
    }
}
