package org.example;

public class Motor {
    private String tipo;
    private int potencia;
    private double cilindrada;
    private String marca;
    private boolean ligado;

    public Motor(String tipo, int potencia, double cilindrada, String marca, boolean ligado) {
        this.tipo = tipo;
        this.potencia = potencia;
        this.cilindrada = cilindrada;
        this.marca = marca;
        this.ligado = ligado;
    }

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

    //métodos com integração
    public boolean ligar(boolean sistemaDeCombustivel, boolean sistemaEletrico) {
        if (sistemaDeCombustivel && sistemaEletrico){
            System.out.println("Motor ligado");
            return this.ligado = true;
        }
        else if(!sistemaDeCombustivel){
            System.out.println("Motor não pode ser ligado, verifique o sistema de combustível");
            return this.ligado = false;
        }
        else{
            System.out.println("Motor não pode ser ligado, verifique o sistema elétrico");
            return this.ligado = false;
        }
    }

    public boolean desligar(boolean carroEmMovimento) {
        if(carroEmMovimento){
            System.out.println("Pare o carro antes de desligar");
            return this.ligado = true;
        }
        else{
            System.out.println("Motor desligado");
            return this.ligado = false;
        }
    }

}
