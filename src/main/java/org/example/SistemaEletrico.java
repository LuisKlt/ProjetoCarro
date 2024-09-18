package org.example;

public class SistemaEletrico {

    private double voltagem;
    private double capacidade;
    private String tipoDeBateria;
    private String marca;
    private boolean estado;

    public double getVoltagem() {
        return voltagem;
    }

    public void setVoltagem(double voltagem) {
        this.voltagem = voltagem;
    }

    public double getCapacidade() {
        return capacidade;
    }

    public void setCapacidade(double capacidade) {
        this.capacidade = capacidade;
    }

    public String getTipoDeBateria() {
        return tipoDeBateria;
    }

    public void setTipoDeBateria(String tipoDeBateria) {
        this.tipoDeBateria = tipoDeBateria;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public boolean verificarBateria() {
        return estado;
    }

    public boolean ligar() {
        return this.testarSistema() && this.getCapacidade() != 0;
    }

    public void desligar() {
        this.estado = false;
    }

    public void substituirBateria(){
        this.setCapacidade(100);
        this.setVoltagem(14.0);
        System.out.println("Bateria substituída!");
    }

    public boolean testarSistema(){
        return this.voltagem >= 13.8 && this.getVoltagem() < 14.4 && this.getCapacidade() > 0;
    }

}
