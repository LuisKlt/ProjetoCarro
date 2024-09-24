package org.example;

import org.junit.jupiter.api.Test;

import java.util.Random;

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
        sistemaDeTransmissao = new SistemaDeTransmissao();
        portas = new Portas();
        freios = new Freios();
        motor = new Motor();
        sistemaDeCombustivel = new SistemaDeCombustivel();
    }

    @Test
    public void integracaoLigarCarro(){

        Random rand = new Random();

        sitemaEletrico.setVoltagem(rand.nextDouble(13.6,14.6));
        System.out.println(sitemaEletrico.getVoltagem());
        sitemaEletrico.setCapacidade(rand.nextInt(100));

        sistemaDeTransmissao.setMarcha(rand.nextInt(6));

        portas.fechar();

        freios.setAcionado(rand.nextBoolean());

        sistemaDeCombustivel.setNivelDeCombustivel(rand.nextFloat(45));

        System.out.println("Integração carro, sitemaEletrico, sistemaDeTransmissao, portas, motor, freios e sistemaDeCombustivel");
        boolean SistComb = sistemaDeCombustivel.ligar();
        assertTrue(SistComb, "O sistema de combustível deve ligar");

        boolean SistElet = sitemaEletrico.ligar();
        assertTrue(SistElet, "O sistema eletrico deve ligar");

        boolean Motor = motor.ligar(SistComb, SistElet);
        assertTrue(Motor, "O motor deve ligar.");

        boolean Freio = freios.isAcionado();
        assertTrue(Freio, "O freio deve estar acionado.");

        String Porta = portas.verificarEstado();
        assertEquals("Fechada", Porta, "A porta deve estar fechada.");

        int SistTrans = sistemaDeTransmissao.getMarcha();
        assertEquals(0, SistTrans, "O carro deve estar no neutro (marcha = 0)");

        assertFalse(carro.isLigado(), "O carro deve estar desligado.");

        boolean Carro = carro.ligar(SistElet, SistTrans, Porta, Motor, Freio, carro.isLigado());
        assertTrue(Carro, "O carro deve estar ligado.");
    }

    @Test
    public void integracaoBancoSistemaEletrico(){
        System.out.println("Integração banco e sitemaEletrico");

    }

    @Test
    public void integracaoLuzesPainelSistemaEletrico(){
        System.out.println("Integração luzes, painel e sitemaEletrico");

    }

}
