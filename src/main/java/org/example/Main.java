package org.example;

public class Main {

    /*
    Bancos I
    Carro I
    Freios I
    Luzes
    Motor I
    Painel
    Pneus
    Portas
    SistemaDeCombustivel I
    SistemaDeTransmissao I
    SistemaEletrico III
    Suspencao
    */

    public static void main(String[] args) {

        Bancos bancos = new Bancos(2, "Couro", "Preto", "Padrão", "Novo", "Levantado", 2.5);
        Carro carro = new Carro("BMW M3", "Azul", "AAA-111", 2022, 15050, false);
        Freios freios = new Freios("Disco", "Cerâmica", "Brembo", 370, 5, true);

        Motor motor = new Motor("Inline 6", 510, 3000, "BMW", false);



        SistemaDeCombustivel sistemaDeCombustivel = new SistemaDeCombustivel("Gasolina", "Bosch", 45, 22.5, true);
        SistemaDeTransmissao sistemaDeTransmissao = new SistemaDeTransmissao("Automático", "Magnésio", "BMW", 6, false, 0);
        SistemaEletrico sistemaEletrico = new SistemaEletrico(13.8, 80, "12V", "Pioneiro", true);


        bancos.ajustarAltura(sistemaEletrico.verificarBateria(), 3);

        motor.ligar(sistemaDeCombustivel.isEstado(), sistemaEletrico.verificarBateria());

        sistemaEletrico.substituirBateria(carro.isLigado());

        carro.ligar(sistemaEletrico.verificarBateria(),sistemaDeTransmissao.getMarcha(), motor.verificarEstado(), freios.isAcionado(), carro.isLigado());
    }

}
