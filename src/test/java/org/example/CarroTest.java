package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.sql.SQLOutput;

public class CarroTest {

    private Carro carro = new Carro("BMW M3", "Azul", "AAA-111", 2022, 15050, false, false);;
    private SistemaEletrico sistemaEletrico = new SistemaEletrico(13.8, 80, "12V", "Pioneiro", true, true);
    private SistemaDeTransmissao sistemaDeTransmissao = new SistemaDeTransmissao("Automático", "Magnésio", "BMW", 6, false, 0);
    private Portas portas = new Portas(2, "Alumínio", "Azul", "Normal", false);
    private Motor motor = new Motor("Inline 6", 510, 3000, "BMW", false);
    private Freios freios = new Freios("Disco", "Cerâmica", "Brembo", 370, 5, true);
    private SistemaDeCombustivel sistemaDeCombustivel = new SistemaDeCombustivel("Gasolina", "Bosch", 45, 22.5, false);
    private Painel painel = new Painel("Digital", "", "BMW", false, false);
    private Bancos bancos = new Bancos(2, "Couro", "Preto", "Padrão", "Novo", "Levantado", 2.5);
    private Luzes luzes = new Luzes("Luz de freio", 6, "Vermelho", false, "Led");
    private Pneus pneus = new Pneus("255/35R19", "Radial", "Toyo", "Novo", 22.9);
    private SistemaDeDirecao sistemaDeDirecao = new SistemaDeDirecao("Elétrica", "Carbono", "BMW", false, 900, 0, "Novo");
    private Suspencao suspencao = new Suspencao("Coilovers","Aço", "Bilstein", 120, 5);

    @Test
    public void ligarMotorTest(){
        System.out.println("ligarMotorTest");
        boolean Motor = motor.ligar(sistemaDeCombustivel.isEstado(), sistemaEletrico.verificarBateria());
        Assertions.assertFalse(Motor, "O motor não deve ligar");
    }
    @Test
    public void ligarCarroTest(){
        System.out.println("ligarCarroTest");
        boolean Carro = carro.ligar(sistemaEletrico.verificarBateria(),sistemaDeTransmissao.getMarcha(), motor.verificarEstado(), freios.isAcionado(), carro.isLigado());
        Assertions.assertFalse(Carro, "O carro não deve ligar");
    }

    @Test
    public void desligarMotorTest(){
        System.out.println("desligarMotorTest");
        boolean Motor = motor.desligar(carro.isMovimento());
        Assertions.assertFalse(Motor, "O motor deve estar desligado");
    }

    @Test
    public void ajustarAlturaTest(){
        System.out.println("ajustarAlturaTest");
        double Exp = 3.5;
        double Altura = bancos.ajustarAltura(sistemaEletrico.verificarBateria(), Exp);
        Assertions.assertEquals(Exp, Altura, "Nova altura deve ser 3.5");
    }

    @Test
    public void substituirBateriaTest(){
        System.out.println("substituirBateriaTest");
        String Exp = "Concluída";
        String Bateria = sistemaEletrico.substituirBateria(carro.isLigado());
        Assertions.assertSame(Exp, Bateria, "A troca deve ser concluída");
    }

    @Test
    public void abrirPortaTest(){
        System.out.println("abrirPortaTest");
        portas.abrir(sistemaEletrico.isTrava());
        boolean Portas = portas.getEstado();
        Assertions.assertFalse(Portas);
    }

    @Test
    public void ligarLuzesTest(){
        System.out.println("ligarLuzesTest");
        luzes.ligar(sistemaEletrico.verificarBateria());
        boolean Luzes = luzes.isEstado();
        Assertions.assertTrue(Luzes);
    }

    @Test
    public void substituirPneusTest(){
        System.out.println("substituirPneusTest");
        boolean Pneus = pneus.substituirPneus(carro.isMovimento(), freios.isAcionado());
        Assertions.assertTrue(Pneus);
    }

    @Test
    public void substituirSuspencaoTest(){
        System.out.println("substituirPneusTest");
        boolean Suspencao = suspencao.substituirSuspencao(carro.isMovimento());
        Assertions.assertTrue(Suspencao);
    }

    @Test
    public void atualizaInfoTest(){
        String Display = painel.atualizaInfo(carro.getModelo(), bancos.getAltura(), luzes.getIntensidade(), pneus.verificarPressao(), sistemaDeDirecao.getAngulo(), suspencao.getAltura(),
                freios.isAcionado(), motor.getPotencia(), sistemaDeCombustivel.verificarNivel(), sistemaDeTransmissao.getMarcha(), portas.getEstado());
        Assertions.assertNotNull(Display, "O display não pode estar vazio");
    }
    @Test
    public void acionaFreioTest(){
        double Exp = freios.verificarDesgaste();
        freios.acionaFreio();
        double Freio = freios.verificarDesgaste();
        Assertions.assertNotEquals(Exp, Freio, "O desgaste não deve ser o mesmo que antes da frenagem");
    }

}
