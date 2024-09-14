package org.example;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class PainelTest {

    @Test
    void testLigarDisplay() {
        Painel painel = new Painel();
        painel.ligarDisplay();
        assertTrue(painel.isEstado(), "O display deve estar ligado.");
    }

    @Test
    void testDesligarDisplay() {
        Painel painel = new Painel();
        painel.ligarDisplay(); 
        painel.desligarDisplay(); 
        assertFalse(painel.isEstado(), "O display deve estar desligado.");
    }

    @Test
    void testAtualizarInformacaoDisplay() {
        Painel painel = new Painel();
        painel.atualizaInfo("Velocidade: 100 km/h");
        assertEquals("Velocidade: 100 km/h", painel.getDisplay(), "A informação do display deve ser 'Velocidade: 100 km/h'.");
    }

    @Test
    void testGetAndSetAtributosPainel() {
        Painel painel = new Painel();
        painel.setTipo("Digital");
        painel.setMarca("Marca Y");
        painel.setControle(true);

        assertAll("Verificação dos atributos do painel",
            () -> assertEquals("Digital", painel.getTipo(), "O tipo do painel deve ser Digital."),
            () -> assertEquals("Marca Y", painel.getMarca(), "A marca do painel deve ser Marca Y."),
            () -> assertTrue(painel.isControle(), "O painel deve ter controle habilitado.")
        );
    }

    @Test
    void testEstadoInicialPainel() {
        Painel painel = new Painel();
        assertFalse(painel.isEstado(), "O painel deve estar desligado inicialmente.");
    }

    @Test
    void testCicloLigarDesligarDisplay() {
        Painel painel = new Painel();
        painel.ligarDisplay(); 
        assertTrue(painel.isEstado(), "O display deve estar ligado.");

        painel.desligarDisplay(); 
        assertFalse(painel.isEstado(), "O display deve estar desligado.");
    }
}
