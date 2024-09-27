package org.example;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.Random;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertSame;

public class CarroTest {

    private Carro carro;
    private SistemaEletrico sitemaEletrico;
    private SistemaDeTransmissao sistemaDeTransmissao;
    private Portas portas;
    private Motor motor;
    private Freios freios;
    private SistemaDeCombustivel sistemaDeCombustivel;
    private Painel painel;
    private Bancos banco;
    private Luzes luzes;
    private Pneus pneus;
    private SistemaDeDirecao sistemaDeDirecao;
    private Suspencao suspencao;
    public CarroTest() {
        carro = new Carro();
        sitemaEletrico = new SistemaEletrico();
        sistemaDeTransmissao = new SistemaDeTransmissao();
        portas = new Portas();
        freios = new Freios();
        motor = new Motor();
        sistemaDeCombustivel = new SistemaDeCombustivel();
        painel = new Painel();
        banco = new Bancos();
        luzes = new Luzes();
        pneus = new Pneus();
        sistemaDeDirecao = new SistemaDeDirecao();
        suspencao = new Suspencao();
    }
    Random rand = new Random();

    @Test
    public void ligarCarroTest(){
        sitemaEletrico.setVoltagem(rand.nextDouble(13.8,14.4));
        sitemaEletrico.setCapacidade(rand.nextInt(10));

        sistemaDeTransmissao.setMarcha(rand.nextInt(6));

        portas.fechar();

        freios.setAcionado(true);

        sistemaDeCombustivel.setNivelDeCombustivel(rand.nextFloat(45));

        banco.ajustarAltura(rand.nextDouble(10));

        luzes.ajustarIntensidade(rand.nextInt(10));

        pneus.ajustarPressao(rand.nextDouble(0, 30));

        sistemaDeDirecao.ajustarDirecao(rand.nextDouble(900));

        suspencao.ajustarAltura(rand.nextDouble(20));

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
        assertSame("Fechada", Porta, "A porta deve estar fechada.");

        int SistTrans = sistemaDeTransmissao.getMarcha();
        assertEquals(0, SistTrans, "O carro deve estar no neutro (marcha = 0)");

        assertFalse(carro.isLigado(), "O carro deve estar desligado.");

        boolean Carro = carro.ligar(SistElet, SistTrans, Porta, Motor, Freio, carro.isLigado());
        assertTrue(Carro, "O carro deve estar ligado.");

        boolean Painel = painel.ligarDisplay(Carro);
        assertTrue(Painel, "O painel deve ligar");

        double Banco = banco.getAltura();

        int Luzes = luzes.getIntensidade();

        double Pneus = pneus.verificarPressao();

        double SistDirecao = sistemaDeDirecao.getAngulo();

        double Suspencao = suspencao.getAltura();

        String Display = painel.atualizaInfo(Banco, Luzes, Pneus, SistDirecao, Suspencao);
        assertSame("Altura do banco: "+Banco+
                "\nIntensidade das luzes: "+Luzes+
                "\nPressão dos pneus: "+Pneus+
                "\nÂngulo da Direção: "+SistDirecao+
                "\nAltura da suspenção: "+Suspencao, Display);

    }

    @Disabled
    @Test
    public void integracaoBancoSistemaEletricoPainel(){
        System.out.println("Integração banco, sitemaEletrico e painel");

    }
    @Disabled
    @Test
    public void integracaoLuzesPainelSistemaEletrico(){
        System.out.println("Integração luzes, painel e sitemaEletrico");

    }



}
