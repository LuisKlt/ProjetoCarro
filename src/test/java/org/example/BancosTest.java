package org.example;
import java.time.Duration;
import java.util.Arrays;
import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class BancosTest {

    @Test
    void testAjustarEncosto() {
        Bancos banco = new Bancos();
        String posicao = banco.ajustarEncosto("reclinada");
        assertEquals("reclinada", posicao, "A posição do encosto deve ser 'reclinada'.");
    }

    @Test
    void testAjustarAltura() {
        Bancos banco = new Bancos();
        double novaAltura = banco.ajustarAltura(45.0);
        assertEquals(45.0, novaAltura, "A altura ajustada deve ser 45.0.");
    }

    @Test
    void testGetAndSetAtributosBancos() {
        Bancos banco = new Bancos();
        banco.setQuantidade(4);
        banco.setMaterial("Couro");
        banco.setCor("Preto");
        banco.setTipo("Esportivo");
        banco.setEstado("Bom");
        banco.setPosicao("Central");
        banco.setAltura(50.0);

        assertAll("Verificação dos atributos dos bancos",
            () -> assertEquals(4, banco.getQuantidade(), "A quantidade de bancos deve ser 4."),
            () -> assertEquals("Couro", banco.getMaterial(), "O material dos bancos deve ser Couro."),
            () -> assertEquals("Preto", banco.getCor(), "A cor dos bancos deve ser Preto."),
            () -> assertEquals("Esportivo", banco.getTipo(), "O tipo dos bancos deve ser Esportivo."),
            () -> assertEquals("Bom", banco.verificarEstado(), "O estado dos bancos deve ser Bom."),
            () -> assertEquals("Central", banco.getPosicao(), "A posição dos bancos deve ser Central."),
            () -> assertEquals(50.0, banco.getAltura(), "A altura dos bancos deve ser 50.0.")
        );
    }

    @Test
    void testEstadoNulo() {
        Bancos banco = new Bancos();
        assertNull(banco.verificarEstado(), "O estado dos bancos deve ser nulo inicialmente.");
    }

    @Test
    void testAjustarAlturaTimeout() {
        Bancos banco = new Bancos();
        assertTimeout(Duration.ofMillis(100), () -> {
            banco.ajustarAltura(30.0);
        }, "O ajuste da altura deve ser feito em menos de 100 ms.");
    }

    @Test
    void testInvalidarAjusteAltura() {
        Bancos banco = new Bancos();
        assertThrows(IllegalArgumentException.class, () -> {
            banco.ajustarAltura(-10.0); // Supondo que altura negativa não é permitida
        }, "Ajustar altura para valores negativos deve lançar IllegalArgumentException.");
    }

    @Test
    void testCompararArrays() {
        Bancos banco = new Bancos();
        int[] quantidades = {4, 2, 6};
        int[] quantidadesEsperadas = {4, 2, 6};
        assertArrayEquals(quantidadesEsperadas, quantidades, "Os arrays de quantidades devem ser iguais.");
    }

    @Test
    void testCompararIterables() {
        Bancos banco = new Bancos();
        List<String> listaEstados = Arrays.asList("Bom", "Regular", "Ruim");
        List<String> listaEstadosEsperados = Arrays.asList("Bom", "Regular", "Ruim");
        assertIterableEquals(listaEstadosEsperados, listaEstados, "As listas de estados devem ser iguais.");
    }

    @Test
    void testCompararLinhas() {
        String textoAtual = "Linha 1\nLinha 2\nLinha 3";
        String textoEsperado = "Linha 1\nLinha 2\nLinha 3";
        assertLinesMatch(Arrays.asList(textoEsperado.split("\n")), Arrays.asList(textoAtual.split("\n")), "As linhas do texto devem corresponder.");
    }
}
