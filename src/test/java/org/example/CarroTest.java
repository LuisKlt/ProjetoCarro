package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CarroTest {

    private Carro carro;
    private SistemaEletrico sitemaEletrico;
    private SistemaDeTransmissao sistemaDeTransmissao;
    private Portas portas;
    private Motor motor;
    private Freios freios;
    private SistemaDeCombustivel sistemaDeCombustivel;

    public CarroTest() {

        carro = new Carro();

        sitemaEletrico = new SistemaEletrico();
        sitemaEletrico.setVoltagem(14);
        sitemaEletrico.setCapacidade(50);

        sistemaDeTransmissao = new SistemaDeTransmissao();
        sistemaDeTransmissao.setMarcha(0);

        portas = new Portas();
        portas.fechar();

        motor = new Motor();

        freios = new Freios();
        freios.setAcionado(true);

        sistemaDeCombustivel = new SistemaDeCombustivel();
        sistemaDeCombustivel.setNivelDeCombustivel(10.47);
    }

    @Test
    public void integracaoLigarCarro(){
        System.out.println("Integração carro, sitemaEletrico, sistemaDeTransmissao, portas, motor, freios e sistemaDeCombustivel");
        boolean SistComb = sistemaDeCombustivel.ligar();
        boolean SistElet = sitemaEletrico.ligar();
        boolean Motor = motor.ligar(SistComb, SistElet);
        boolean Freio = freios.isAcionado();
        String Porta = portas.verificarEstado();
        int SistTrans = sistemaDeTransmissao.getMarcha();
        boolean Carro = carro.ligar(SistElet, SistTrans, Porta, Motor, Freio, carro.isLigado());
        assertTrue(Carro, "O carro deve estar ligado.");
    }

}
