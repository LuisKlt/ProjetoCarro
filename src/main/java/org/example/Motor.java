package org.example;

public class Motor {

    private String tipo;
    private int potencia;
    private double cilindrada;
    private String marca;
    private boolean ligado;

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getPotencia() {
        return potencia;
    }

    public void setPotencia(int potencia) {
        this.potencia = potencia;
    }

    public double getCilindrada() {
        return cilindrada;
    }

    public void setCilindrada(double cilindrada) {
        this.cilindrada = cilindrada;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public boolean verificarEstado() {
        return ligado;
    }

    public boolean ligar(boolean sistemaDeCombustivel, boolean sistemaEletrico) {
        return this.ligado = sistemaDeCombustivel && sistemaEletrico;
    }

    public void desligar() {
        this.ligado = false;
    }

}
