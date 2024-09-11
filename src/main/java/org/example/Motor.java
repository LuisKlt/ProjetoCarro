package org.example;

public class Motor {

    private String tipo;
    private int potencia;
    private double cilindrada;
    private String marca;
    private boolean estado;

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
        return estado;
    }

    public void ligar() {
        this.estado = true;
    }

    public void desligar() {
        this.estado = false;
    }

}
