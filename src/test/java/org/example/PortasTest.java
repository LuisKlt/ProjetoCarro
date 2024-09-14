package org.example;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class PortasTest {

    @Test
    void testAbrirPorta() {
        Portas porta = new Portas();
        porta.abrir();
        assertEquals("Aberta", porta.verificarEstado(), "A porta deve estar aberta.");
    }

    @Test
    void testFecharPorta() {
        Portas porta = new Portas();
        porta.fechar();
        assertEquals("Fechada", porta.verificarEstado(), "A porta deve estar fechada.");
    }

    @Test
    void testGetAndSetAtributosPortas() {
        Portas porta = new Portas();
        porta.setQuantidade(4);
        porta.setMaterial("Alumínio");
        porta.setCor("Preto");
        porta.setTipo("Deslizante");
        porta.setEstado("Fechada");

        assertAll("Verificação dos atributos das portas",
            () -> assertEquals(4, porta.getQuantidade(), "A quantidade de portas deve ser 4."),
            () -> assertEquals("Alumínio", porta.getMaterial(), "O material da porta deve ser Alumínio."),
            () -> assertEquals("Preto", porta.getCor(), "A cor da porta deve ser Preto."),
            () -> assertEquals("Deslizante", porta.getTipo(), "O tipo da porta deve ser Deslizante."),
            () -> assertEquals("Fechada", porta.verificarEstado(), "O estado da porta deve ser Fechada.")
        );
    }

    @Test
    void testEstadoInicialPorta() {
        Portas porta = new Portas();
        assertNull(porta.verificarEstado(), "O estado inicial da porta deve ser nulo.");
    }

    @Test
    void testQuantidadePortasValida() {
        Portas porta = new Portas();
        porta.setQuantidade(2);
        assertTrue(porta.getQuantidade() > 0, "A quantidade de portas deve ser maior que 0.");
    }

    @Test
    void testAbrirEFecharPorta() {
        Portas porta = new Portas();
        porta.abrir();
        assertEquals("Aberta", porta.verificarEstado(), "A porta deve estar aberta.");
        porta.fechar();
        assertEquals("Fechada", porta.verificarEstado(), "A porta deve estar fechada.");
    }
}
