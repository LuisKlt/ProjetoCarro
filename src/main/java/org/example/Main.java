package org.example;

public class Main {

    public static void main(String[] args) {

        Bancos bancos = new Bancos(2, "Couro", "Preto", "Padrão", "Novo", "Levantado", 2.5);
        Carro carro = new Carro("BMW M3", "Azul", "AAA-111", 2022, 15050, false, false);
        Freios freios = new Freios("Disco", "Cerâmica", "Brembo", 370, 5, true);
        Luzes luzes = new Luzes("Luzes dianteiras", 6, "Vermelho", false, "Led");
        Motor motor = new Motor("Inline 6", 510, 3000, "BMW", false);
        Painel painel = new Painel("Digital", "", "BMW", false, false);
        Pneus pneus = new Pneus("255/35R19", "Radial", "Toyo", "Novo", 22.9);
        Portas portas = new Portas(2, "Alumínio", "Azul", "Normal", false);
        SistemaDeCombustivel sistemaDeCombustivel = new SistemaDeCombustivel("Gasolina", "Bosch", 59, 22.5, false);
        SistemaDeDirecao sistemaDeDirecao = new SistemaDeDirecao("Elétrica", "Carbono", "BMW", false, 18, 0);
        SistemaDeTransmissao sistemaDeTransmissao = new SistemaDeTransmissao("Automático", "Magnésio", "BMW", 6, false, 0);
        SistemaEletrico sistemaEletrico = new SistemaEletrico(13.8, 0, "12V", "Pioneiro", false, true);
        Suspencao suspencao = new Suspencao("Coilovers","Aço", "Bilstein", 120, 5);

        System.out.println("\n-- Sistema de combustível --");
        sistemaDeCombustivel.verificarNivel(carro.isMovimento());
        sistemaDeCombustivel.ligar();
        sistemaDeCombustivel.abastecer(10, sistemaDeCombustivel.getNivel(), sistemaDeCombustivel.getCapacidade(), carro.isMovimento());

        System.out.println("\n-- Sistema elétrico --");
        sistemaEletrico.testarSistema();
        sistemaEletrico.substituirBateria(carro.isLigado());
        sistemaEletrico.ligar(sistemaEletrico.testarSistema());

        System.out.println("\n-- Motor --");
        motor.ligar(sistemaDeCombustivel.isEstado(), sistemaEletrico.getBateria());

        System.out.println("\n-- Carro --");
        carro.ligar(sistemaEletrico.getBateria(), sistemaDeTransmissao.getMarcha(), motor.verificarEstado(), freios.isAcionado(), carro.isLigado());
        carro.acelerar(carro.isLigado(), freios.isAcionado());

        System.out.println("\n-- Freio --");
        freios.desacionaFreio();

        System.out.println("\n-- Carro --");
        carro.acelerar(carro.isLigado(), freios.isAcionado());

        System.out.println("\n-- Freio --");
        freios.acionaFreio(carro.isMovimento());

        System.out.println("\n-- Painel --");
        painel.ligarDisplay(sistemaEletrico.getBateria());
        painel.atualizaInfo(carro.getModelo(), bancos.getAltura(), luzes.getIntensidade(), pneus.getPressao(), sistemaDeDirecao.getAngulo(),suspencao.getAltura(),
                freios.getAcionado(freios.isAcionado()), motor.getPotencia(), sistemaDeCombustivel.getNivel(), sistemaDeTransmissao.getMarcha(), portas.getEstado());
        System.out.println(painel.getDisplay());

        System.out.println("\n-- Bancos --");
        bancos.ajustarAltura(sistemaEletrico.getBateria(), 3.2);

        System.out.println("\n-- Luzes --");
        luzes.ligar(sistemaEletrico.getBateria());
        luzes.ajustarIntensidade(luzes.isEstado(), 8);

        System.out.println("\n-- Portas --");
        portas.abrir(sistemaEletrico.isTrava());
        sistemaEletrico.liberaTrava();
        portas.abrir(sistemaEletrico.isTrava());

        System.out.println("\n-- Direção --");
        sistemaDeDirecao.ativaAssistido(sistemaEletrico.getBateria());
        sistemaDeDirecao.ajustarDirecao(-100);

        System.out.println("\n-- Transmissão --");
        sistemaDeTransmissao.aumentarMarcha();
        sistemaDeTransmissao.diminuirMarcha();

        System.out.println("\n-- Pneus --");
        pneus.ajustarPressao(21);
        pneus.substituirPneus(carro.isMovimento(), freios.isAcionado());

        System.out.println("\n-- Suspenção --");
        suspencao.ajustarAltura(sistemaEletrico.getBateria(), 140);
        suspencao.substituirSuspencao(carro.isMovimento());

    }

}
