package org.example;

public class Pneus {

    private String tamanho;
    private String tipo;
    private String marca;
    private String estado;
    private double pressao;

    public Pneus(String tamanho, String tipo, String marca, String estado, double pressao) {
        this.tamanho = tamanho;
        this.tipo = tipo;
        this.marca = marca;
        this.estado = estado;
        this.pressao = pressao;
    }

    public String getTamanho() {
        return tamanho;
    }

    public void setTamanho(String tamanho) {
        this.tamanho = tamanho;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    //métodos com integração
    public double verificarPressao() {
        return pressao;
    }

    public void ajustarPressao(double novaPressao) {
        this.pressao = novaPressao;
    }


    public void substituir(){
        System.out.println("Pneu substituído!");
    }

}
