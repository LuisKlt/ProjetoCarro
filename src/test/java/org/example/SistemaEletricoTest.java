package org.example;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class SistemaEletricoTest {

    @Test
    void testLigarComEstadoCorreto() {
        SistemaEletrico sistemaEletrico = new SistemaEletrico();
        sistemaEletrico.setCapacidade(50); 
        sistemaEletrico.setVoltagem(13.9); 
        assertTrue(sistemaEletrico.ligar(), "O sistema elétrico deve ligar quando a capacidade não for zero e a voltagem estiver adequada.");
    }

    @Test
    void testLigarComCapacidadeZero() {
        SistemaEletrico sistemaEletrico = new SistemaEletrico();
        sistemaEletrico.setCapacidade(0); 
        sistemaEletrico.setVoltagem(13.9); 
        assertFalse(sistemaEletrico.ligar(), "O sistema elétrico não deve ligar quando a capacidade for zero.");
    }

    @Test
    void testDesligar() {
        SistemaEletrico sistemaEletrico = new SistemaEletrico();
        sistemaEletrico.desligar();
        assertFalse(sistemaEletrico.verificarBateria(), "O estado da bateria deve ser falso após chamar desligar.");
    }

    @Test
    void testSubstituirBateria() {
        SistemaEletrico sistemaEletrico = new SistemaEletrico();
        sistemaEletrico.substituirBateria();
        assertEquals(100, sistemaEletrico.getCapacidade(), "A capacidade da bateria deve ser 100 após substituição.");
        assertEquals(14.0, sistemaEletrico.getVoltagem(), "A voltagem da bateria deve ser 14.0 após substituição.");
    }

    @Test
    void testTestarSistemaComVoltagemAdequada() {
        SistemaEletrico sistemaEletrico = new SistemaEletrico();
        sistemaEletrico.setVoltagem(13.9);
        sistemaEletrico.setCapacidade(50); 
        assertTrue(sistemaEletrico.testarSistema(), "O sistema elétrico deve estar adequado com voltagem dentro do intervalo e capacidade não zero.");
    }

    @Test
    void testTestarSistemaComVoltagemInadequada() {
        SistemaEletrico sistemaEletrico = new SistemaEletrico();
        sistemaEletrico.setVoltagem(12.5); 
        sistemaEletrico.setCapacidade(50); 
        assertFalse(sistemaEletrico.testarSistema(), "O sistema elétrico não deve estar adequado com voltagem fora do intervalo.");
    }

    @Test
    void testTestarSistemaComCapacidadeZero() {
        SistemaEletrico sistemaEletrico = new SistemaEletrico();
        sistemaEletrico.setCapacidade(0); 
        sistemaEletrico.setVoltagem(13.9); 
        assertFalse(sistemaEletrico.testarSistema(), "O sistema elétrico não deve estar adequado com capacidade zero.");
    }
}
