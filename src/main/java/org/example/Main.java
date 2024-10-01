package org.example;

public class Main {

    /*
    Bancos II
    Carro IIII
    Freios II
    Luzes II
    Motor II
    Painel IIII
    Pneus II
    Portas II
    SistemaDeCombustivel II
    SistemaDeTransmissao II
    SistemaEletrico IIII
    Suspencao II
    */

    public static void main(String[] args) {

        Bancos bancos = new Bancos(2, "Couro", "Preto", "Padrão", "Novo", "Levantado", 2.5);
        Carro carro = new Carro("BMW M3", "Azul", "AAA-111", 2022, 15050, false, false);
        Freios freios = new Freios("Disco", "Cerâmica", "Brembo", 370, 5, true);
        Luzes luzes = new Luzes("Luzes dianteiras", 6, "Vermelho", false, "Led");
        Motor motor = new Motor("Inline 6", 510, 3000, "BMW", false);
        Painel painel = new Painel("Digital", "", "BMW", false, false);
        Pneus pneus = new Pneus("255/35R19", "Radial", "Toyo", "Novo", 22.9);
        Portas portas = new Portas(2, "Alumínio", "Azul", "Normal", false);
        SistemaDeCombustivel sistemaDeCombustivel = new SistemaDeCombustivel("Gasolina", "Bosch", 59, 22.5, true);
        SistemaDeDirecao sistemaDeDirecao = new SistemaDeDirecao("Elétrica", "Carbono", "BMW", false, 900, 0, "Novo");
        SistemaDeTransmissao sistemaDeTransmissao = new SistemaDeTransmissao("Automático", "Magnésio", "BMW", 6, false, 0);
        SistemaEletrico sistemaEletrico = new SistemaEletrico(13.8, 80, "12V", "Pioneiro", true, false);
        Suspencao suspencao = new Suspencao("Coilovers","Aço", "Bilstein", 120, 5);

        bancos.ajustarAltura(sistemaEletrico.verificarBateria(), 3);

        motor.ligar(sistemaDeCombustivel.isEstado(), sistemaEletrico.verificarBateria());

        motor.desligar(carro.isMovimento());

        sistemaEletrico.substituirBateria(carro.isLigado());

        carro.ligar(sistemaEletrico.verificarBateria(),sistemaDeTransmissao.getMarcha(), motor.verificarEstado(), freios.isAcionado(), carro.isLigado());

        portas.abrir(sistemaEletrico.isTrava());

        luzes.ligar(sistemaEletrico.verificarBateria());

        pneus.substituirPneus(carro.isMovimento(), freios.isAcionado());

        suspencao.substituirSuspencao(carro.isMovimento());

        painel.ligarDisplay(sistemaEletrico.verificarBateria());

        painel.atualizaInfo(carro.getModelo(), bancos.getAltura(), luzes.getIntensidade(), pneus.verificarPressao(), sistemaDeDirecao.getAngulo(), suspencao.getAltura(),
                freios.isAcionado(), motor.getPotencia(), sistemaDeCombustivel.verificarNivel(), sistemaDeTransmissao.getMarcha(), portas.getEstado());

    }

}
