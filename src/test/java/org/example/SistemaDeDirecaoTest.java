package org.example;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class SistemaDeDirecaoTest {

    @Test
    void testAjustarDirecao() {
        SistemaDeDirecao direcao = new SistemaDeDirecao();
        direcao.ajustarDirecao(45.0);
        assertEquals(45.0, direcao.getAngulo(), 0.01, "O ângulo da direção deve ser 45.0.");
    }

    @Test
    void testVerificarEstado() {
        SistemaDeDirecao direcao = new SistemaDeDirecao();
        direcao.setEstado("Ajustado");
        assertEquals("Ajustado", direcao.verificarEstado(), "O estado da direção deve ser 'Ajustado'.");
    }

    @Test
    void testAssistidoTrue() {
        SistemaDeDirecao direcao = new SistemaDeDirecao();
        direcao.setAssistido(true);
        assertTrue(direcao.isAssistido(), "A direção deve ser assistida.");
    }

    @Test
    void testAssistidoFalse() {
        SistemaDeDirecao direcao = new SistemaDeDirecao();
        direcao.setAssistido(false);
        assertFalse(direcao.isAssistido(), "A direção não deve ser assistida.");
    }

    @Test
    void testSubstituirComponente() {
        SistemaDeDirecao direcao = new SistemaDeDirecao();
        assertDoesNotThrow(() -> direcao.substituirComponente("Volante"), "A substituição do componente 'Volante' deve ser realizada sem erros.");
    }

    @Test
    void testGetAndSetAtributosDirecao() {
        SistemaDeDirecao direcao = new SistemaDeDirecao();
        direcao.setTipo("Hidráulica");
        direcao.setMaterial("Aço");
        direcao.setMarca("Marca Y");
        direcao.setRelacao(16.5);
        direcao.setAssistido(true);

        assertAll("Verificação dos atributos do sistema de direção",
            () -> assertEquals("Hidráulica", direcao.getTipo(), "O tipo da direção deve ser Hidráulica."),
            () -> assertEquals("Aço", direcao.getMaterial(), "O material da direção deve ser Aço."),
            () -> assertEquals("Marca Y", direcao.getMarca(), "A marca da direção deve ser 'Marca Y'."),
            () -> assertEquals(16.5, direcao.getRelacao(), 0.01, "A relação da direção deve ser 16.5."),
            () -> assertTrue(direcao.isAssistido(), "A direção deve ser assistida.")
        );
    }
}
