package org.example;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class SuspencaoTest {

    @Test
    void testAjustarAltura() {
        Suspencao suspensao = new Suspencao();
        suspensao.setAltura(20.0);
        suspensao.ajustarAltura(25.0);
        assertEquals(25.0, suspensao.getAltura(), "A altura da suspensão deve ser ajustada para 25.0.");
    }

    @Test
    void testVerificarEstado() {
        Suspencao suspensao = new Suspencao();
        suspensao.setRegidez(10);
        assertEquals(10, suspensao.verificarEstado(), "O nível de rigidez da suspensão deve ser 10.");
    }

    @Test
    void testSubstituir() {
        Suspencao suspensao = new Suspencao();
        assertDoesNotThrow(() -> suspensao.substituir(), "O método substituir não deve lançar exceção.");
    }

    @Test
    void testGetAndSetAtributosSuspensao() {
        Suspencao suspensao = new Suspencao();
        suspensao.setTipo("Hidráulica");
        suspensao.setMaterial("Aço");
        suspensao.setMarca("MarcaX");
        suspensao.setAltura(30.0);
        suspensao.setRegidez(15);

        assertAll("Verificação dos atributos da suspensão",
            () -> assertEquals("Hidráulica", suspensao.getTipo(), "O tipo da suspensão deve ser Hidráulica."),
            () -> assertEquals("Aço", suspensao.getMaterial(), "O material da suspensão deve ser Aço."),
            () -> assertEquals("MarcaX", suspensao.getMarca(), "A marca da suspensão deve ser MarcaX."),
            () -> assertEquals(30.0, suspensao.getAltura(), "A altura da suspensão deve ser 30.0."),
            () -> assertEquals(15, suspensao.getRegidez(), "A rigidez da suspensão deve ser 15.")
        );
    }
}
