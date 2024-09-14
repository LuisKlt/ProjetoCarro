package org.example;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class MotorTest {

    @Test
    void testLigarMotorComSistemaDeCombustivel() {
        Motor motor = new Motor();
        boolean sistemaDeCombustivel = true; // Sistema de combustível presente
        motor.ligar(sistemaDeCombustivel);
        assertTrue(motor.verificarEstado(), "O motor deve estar ligado quando o sistema de combustível está presente.");
    }

    @Test
    void testLigarMotorSemSistemaDeCombustivel() {
        Motor motor = new Motor();
        boolean sistemaDeCombustivel = false; // Sistema de combustível ausente
        motor.ligar(sistemaDeCombustivel);
        assertFalse(motor.verificarEstado(), "O motor não deve ligar sem o sistema de combustível.");
    }

    @Test
    void testDesligarMotor() {
        Motor motor = new Motor();
        motor.ligar(true); // Liga o motor
        motor.desligar(); // Desliga o motor
        assertFalse(motor.verificarEstado(), "O motor deve estar desligado após o comando desligar.");
    }

    @Test
    void testGetAndSetAtributosMotor() {
        Motor motor = new Motor();
        motor.setTipo("V8");
        motor.setPotencia(400);
        motor.setCilindrada(5.0);
        motor.setMarca("Marca X");

        assertAll("Verificação dos atributos do motor",
            () -> assertEquals("V8", motor.getTipo(), "O tipo do motor deve ser V8."),
            () -> assertEquals(400, motor.getPotencia(), "A potência do motor deve ser 400."),
            () -> assertEquals(5.0, motor.getCilindrada(), "A cilindrada do motor deve ser 5.0."),
            () -> assertEquals("Marca X", motor.getMarca(), "A marca do motor deve ser Marca X.")
        );
    }

    @Test
    void testEstadoInicialMotor() {
        Motor motor = new Motor();
        assertFalse(motor.verificarEstado(), "O motor deve estar desligado inicialmente.");
    }

    @Test
    void testLigarDesligarCiclo() {
        Motor motor = new Motor();
        motor.ligar(true); // Liga o motor
        assertTrue(motor.verificarEstado(), "O motor deve estar ligado.");

        motor.desligar(); // Desliga o motor
        assertFalse(motor.verificarEstado(), "O motor deve estar desligado.");
    }
}
