package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CarroTest {

    private Carro carro = new Carro("BMW M3", "Azul", "AAA-111", 2022, 15050, false, false);;
    private SistemaEletrico sistemaEletrico = new SistemaEletrico(13.8, 80, "12V", "Pioneiro", true);
    private SistemaDeTransmissao sistemaDeTransmissao = new SistemaDeTransmissao("Automático", "Magnésio", "BMW", 6, false, 0);
    private Portas portas;
    private Motor motor = new Motor("Inline 6", 510, 3000, "BMW", false);
    private Freios freios = new Freios("Disco", "Cerâmica", "Brembo", 370, 5, true);
    private SistemaDeCombustivel sistemaDeCombustivel = new SistemaDeCombustivel("Gasolina", "Bosch", 45, 22.5, false);
    private Painel painel;
    private Bancos bancos = new Bancos(2, "Couro", "Preto", "Padrão", "Novo", "Levantado", 2.5);
    private Luzes luzes;
    private Pneus pneus;
    private SistemaDeDirecao sistemaDeDirecao;
    private Suspencao suspencao;

    @Test
    public void ligarMotorTest(){
        boolean Motor = motor.ligar(sistemaDeCombustivel.isEstado(), sistemaEletrico.verificarBateria());
        Assertions.assertFalse(Motor, "O motor não deve ligar");
    }
    @Test
    public void ligarCarroTest(){
        boolean Carro = carro.ligar(sistemaEletrico.verificarBateria(),sistemaDeTransmissao.getMarcha(), motor.verificarEstado(), freios.isAcionado(), carro.isLigado());
        Assertions.assertFalse(Carro, "O carro não deve ligar");
    }

    @Test
    public void ajustarAlturaTest(){
        double Exp = 3.5;
        double Altura = bancos.ajustarAltura(sistemaEletrico.verificarBateria(), Exp);
        Assertions.assertEquals(Exp, Altura, "Nova altura deve ser 3.5");
    }

    @Test
    public void substituirBateriaTest(){
        String Exp = "Concluída";
        String Bateria = sistemaEletrico.substituirBateria(carro.isLigado());
        Assertions.assertSame(Exp, Bateria, "A troca deve ser concluída");
    }

    @Test
    public void


}
