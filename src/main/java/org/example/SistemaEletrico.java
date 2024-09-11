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

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    public void substituirBateria(){
        System.out.println("Bateria substituída!");
    }

    public boolean testarSistema(){
        if (this.voltagem >= 13.8 && this.voltagem < 14.4 && this.capacidade != 0){
            return true;
        }
        else {
            return false;
        }
    }

}
