package org.example;

import java.util.Objects;

public class Carro {
    private String modelo;
    private String cor;
    private String placa;
    private int ano;
    private double quilometragem;
    private boolean ligado = false;

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public double getQuilometragem() {
        return quilometragem;
    }

    public void setQuilometragem(double quilometragem) {
        this.quilometragem = quilometragem;
    }

    public boolean isLigado() {
        return ligado;
    }

    public boolean ligar(boolean sistemaEletrico, int sistemaDeTransmissao, String portas, boolean motor, boolean freio, boolean carro) {
        return this.ligado = sistemaEletrico && sistemaDeTransmissao == 0 && Objects.equals(portas, "Fechada") && motor && freio && !carro;
    }

    public boolean desligar() {
        return this.ligado = false;
    }

    public void atualizarQuilometragem(double km) {
        this.setQuilometragem(km);
    }

}
