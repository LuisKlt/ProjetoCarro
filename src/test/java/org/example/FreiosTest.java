package org.example;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class FreiosTest {

    @Test
    void testVerificarDesgaste() {
        Freios freios = new Freios();
        freios.setNivelDeDesgaste(30.0);
        assertEquals(30.0, freios.verificarDesgaste(), "O nível de desgaste deve ser 30.0");
    }

    @Test
    void testSubstituirPastilhas() {
        Freios freios = new Freios();
        freios.substituirPastilhas();
        assertDoesNotThrow(() -> freios.substituirPastilhas(), "A substituição das pastilhas deve ocorrer sem exceções.");
    }

    @Test
    void testAjustarFreio() {
        Freios freios = new Freios();
        freios.ajustarFreio();
        assertDoesNotThrow(() -> freios.ajustarFreio(), "O ajuste do freio deve ocorrer sem exceções.");
    }

    @Test
    void testAcionarFreio() {
        Freios freios = new Freios();
        freios.setAcionado(true);
        assertTrue(freios.isAcionado(), "O freio deve estar acionado.");
    }

    @Test
    void testDesacionarFreio() {
        Freios freios = new Freios();
        freios.setAcionado(false);
        assertFalse(freios.isAcionado(), "O freio deve estar desacionado.");
    }

    @Test
    void testGetAndSetAtributos() {
        Freios freios = new Freios();
        freios.setTipo("Disco");
        freios.setMaterial("Cerâmica");
        freios.setMarca("Marca X");
        freios.setTamanho(32.5);

        assertAll("Verificação dos atributos do freio",
            () -> assertEquals("Disco", freios.getTipo(), "O tipo deve ser Disco"),
            () -> assertEquals("Cerâmica", freios.getMaterial(), "O material deve ser Cerâmica"),
            () -> assertEquals("Marca X", freios.getMarca(), "A marca deve ser Marca X"),
            () -> assertEquals(32.5, freios.getTamanho(), "O tamanho deve ser 32.5")
        );
    }
}
