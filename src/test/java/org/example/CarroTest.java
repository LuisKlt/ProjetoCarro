package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CarroTest {

    private Carro carro;
    private SistemaEletrico sistemaEletrico = new SistemaEletrico(13.8, 80, "12V", "Pioneiro", true);
    private SistemaDeTransmissao sistemaDeTransmissao;
    private Portas portas;
    private Motor motor;
    private Freios freios;
    private SistemaDeCombustivel sistemaDeCombustivel;
    private Painel painel;
    private Bancos bancos = new Bancos(2, "Couro", "Preto", "Padrão", "Novo", "Levantado", 2.5);
    private Luzes luzes;
    private Pneus pneus;
    private SistemaDeDirecao sistemaDeDirecao;
    private Suspencao suspencao;

    @Test
    public void ligarCarroTest(){

    }

    @Test
    public void ajustarAlturaTest(){
        double exp = 3.5;
        double altura = bancos.ajustarAltura(sistemaEletrico.verificarBateria(), exp);
        Assertions.assertEquals(exp, altura, "Nova altura deve ser 3.5");
    }

    @Test
    public void integracaoLuzesPainelSistemaEletrico(){

    }

}
