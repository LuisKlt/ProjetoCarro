package org.example;

public class Carro {
    private String modelo;
    private String cor;
    private String placa;
    private int ano;
    private double quilometragem;

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

    public boolean ligar() {
        return true;
    }

    public boolean desligar() {
        return false;
    }

    public void atualizarQuilometragem(double km) {
        this.setQuilometragem(km);
    }
}
