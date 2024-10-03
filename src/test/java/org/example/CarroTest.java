package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CarroTest {

    private Carro carro = new Carro("BMW M3", "Azul", "AAA-111", 2022, 15050, false, false);;
    private SistemaEletrico sistemaEletrico = new SistemaEletrico(13.8, 80, "12V", "Pioneiro", true, true);
    private SistemaDeTransmissao sistemaDeTransmissao = new SistemaDeTransmissao("Automático", "Magnésio", "BMW", 6, false, 0);
    private Portas portas = new Portas(2, "Alumínio", "Azul", "Normal", false);
    private Motor motor = new Motor("Inline 6", 510, 3000, "BMW", false);
    private Freios freios = new Freios("Disco", "Cerâmica", "Brembo", 370, 5, true);
    private SistemaDeCombustivel sistemaDeCombustivel = new SistemaDeCombustivel("Gasolina", "Bosch", 45, 50, false);
    private Painel painel = new Painel("Digital", "", "BMW", false, false);
    private Bancos bancos = new Bancos(2, "Couro", "Preto", "Padrão", "Novo", "Levantado", 2.5);
    private Luzes luzes = new Luzes("Luz de freio", 6, "Vermelho", false, "Led");
    private Pneus pneus = new Pneus("255/35R19", "Radial", "Toyo", "Novo", 22.9);
    private SistemaDeDirecao sistemaDeDirecao = new SistemaDeDirecao("Elétrica", "Carbono", "BMW", false, 18, 0);
    private Suspencao suspencao = new Suspencao("Coilovers","Aço", "Bilstein", 120, 5);

    @Test
    public void ligarMotorTest(){
        System.out.println("\n ligarMotorTest");
        boolean Motor = motor.ligar(sistemaDeCombustivel.isEstado(), sistemaEletrico.getBateria());
        Assertions.assertFalse(Motor, "O motor não deve ligar");
    }
    @Test
    public void ligarCarroTest(){
        System.out.println("\n ligarCarroTest");
        boolean Carro = carro.ligar(sistemaEletrico.getBateria(),sistemaDeTransmissao.getMarcha(), motor.verificarEstado(), freios.isAcionado(), carro.isLigado());
        Assertions.assertFalse(Carro, "O carro não deve ligar");
    }

    @Test
    public void desligarMotorTest(){
        System.out.println("\n desligarMotorTest");
        boolean Motor = motor.desligar(carro.isMovimento());
        Assertions.assertFalse(Motor, "O motor deve estar desligado");
    }

    @Test
    public void desligarCarroTest(){
        System.out.println("\n desligarCarroTest");
        boolean Carro = carro.desligar(freios.isAcionado(), carro.isMovimento());
        Assertions.assertFalse(Carro, "O carro deve estar desligado");
    }

    @Test
    public void ajustarAlturaTest(){
        System.out.println("\n ajustarAlturaTest");
        double Exp = 3.5;
        double Altura = bancos.ajustarAltura(sistemaEletrico.getBateria(), Exp);
        Assertions.assertEquals(Exp, Altura, "Nova altura deve ser 3.5");
    }

    @Test
    public void substituirBateriaTest(){
        System.out.println("\n substituirBateriaTest");
        String Exp = "Concluída";
        String Bateria = sistemaEletrico.substituirBateria(carro.isLigado());
        Assertions.assertSame(Exp, Bateria, "A troca deve ser concluída");
    }

    @Test
    public void abrirPortaTest(){
        System.out.println("\n abrirPortaTest");
        portas.abrir(sistemaEletrico.isTrava());
        String Exp = "Fechada";
        String Portas = portas.getEstado();
        Assertions.assertSame(Exp, Portas, "A porta não deve abrir");
    }

    @Test
    public void ligarLuzesTest(){
        System.out.println("\n ligarLuzesTest");
        luzes.ligar(sistemaEletrico.getBateria());
        boolean Luzes = luzes.isEstado();
        Assertions.assertTrue(Luzes, "As luzes devem ligar");
    }

    @Test
    public void substituirPneusTest(){
        System.out.println("\n substituirPneusTest");
        boolean Pneus = pneus.substituirPneus(carro.isMovimento(), freios.isAcionado());
        Assertions.assertTrue(Pneus, "Os pneus devem ser substituídos");
    }

    @Test
    public void substituirSuspencaoTest(){
        System.out.println("\n substituirPneusTest");
        boolean Suspencao = suspencao.substituirSuspencao(carro.isMovimento());
        Assertions.assertTrue(Suspencao, "A suspenção deve ser substituída");
    }

    @Test
    public void ligarDisplayTest(){
        System.out.println("\n ligarDisplayTest");
        boolean Display = painel.ligarDisplay(sistemaEletrico.getBateria());
        Assertions.assertTrue(Display, "O display deve ligar");
    }

    @Test
    public void atualizaInfoTest(){
        System.out.println("\n atualizaInfoTest");
        String Display = painel.atualizaInfo(carro.getModelo(), bancos.getAltura(), luzes.getIntensidade(), pneus.getPressao(), sistemaDeDirecao.getAngulo(), suspencao.getAltura(),
                freios.getAcionado(freios.isAcionado()), motor.getPotencia(), sistemaDeCombustivel.verificarNivel(carro.isMovimento()), sistemaDeTransmissao.getMarcha(), portas.getEstado());
        System.out.println(Display);
        Assertions.assertNotNull(Display, "O display não pode estar vazio");
    }
    @Test
    public void acionaFreioTest(){
        System.out.println("\n acionaFreioTest");
        double Exp = freios.verificarDesgaste();
        freios.acionaFreio(carro.isMovimento());
        double Freio = freios.verificarDesgaste();
        Assertions.assertNotEquals(Exp, Freio, "O desgaste não deve ser o mesmo que antes da frenagem");
    }

}
