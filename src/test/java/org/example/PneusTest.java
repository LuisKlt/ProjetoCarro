package org.example;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class PneusTest {

    @Test
    void testAjustarPressao() {
        Pneus pneu = new Pneus();
        pneu.AjustarPressao(32.5);
        assertEquals(32.5, pneu.verificarPressao(), "A pressão do pneu deve ser ajustada para 32.5.");
    }

    @Test
    void testVerificarPressao() {
        Pneus pneu = new Pneus();
        pneu.AjustarPressao(30.0);
        assertEquals(30.0, pneu.verificarPressao(), "A pressão do pneu deve ser 30.0.");
    }

    @Test
    void testSubstituirPneu() {
        Pneus pneu = new Pneus();
        pneu.substituir();
        assertEquals("Novo", pneu.getEstado(), "O estado do pneu deve ser 'Novo' após a substituição.");
    }

    @Test
    void testGetAndSetAtributosPneus() {
        Pneus pneu = new Pneus();
        pneu.setTamanho("225/45 R17");
        pneu.setTipo("Radial");
        pneu.setMarca("Michelin");
        pneu.setEstado("Usado");

        assertAll("Verificação dos atributos do pneu",
            () -> assertEquals("225/45 R17", pneu.getTamanho(), "O tamanho do pneu deve ser 225/45 R17."),
            () -> assertEquals("Radial", pneu.getTipo(), "O tipo do pneu deve ser Radial."),
            () -> assertEquals("Michelin", pneu.getMarca(), "A marca do pneu deve ser Michelin."),
            () -> assertEquals("Usado", pneu.getEstado(), "O estado do pneu deve ser Usado.")
        );
    }

    @Test
    void testEstadoInicialPneu() {
        Pneus pneu = new Pneus();
        assertNull(pneu.getEstado(), "O estado inicial do pneu deve ser nulo.");
    }

    @Test
    void testPressaoDentroDosLimites() {
        Pneus pneu = new Pneus();
        pneu.AjustarPressao(35.0);
        assertTrue(pneu.verificarPressao() >= 30.0 && pneu.verificarPressao() <= 35.0, "A pressão do pneu deve estar entre 30.0 e 35.0.");
    }
}
