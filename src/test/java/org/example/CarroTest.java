package org.example;

import org.junit.jupiter.api.Test;

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
        motor = new Motor();
        freios = new Freios();
        sistemaDeCombustivel = new SistemaDeCombustivel();
    }

}
