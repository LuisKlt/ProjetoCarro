package org.example;

public class SistemaDeCombustivel {

    private String tipoCombustivel;
    private String marca;
    private double capacidade;
    private double nivelDeCombustivel;
    private boolean estado;

    public SistemaDeCombustivel(String tipoCombustivel, String marca, double capacidade, double nivelDeCombustivel, boolean estado) {
        this.tipoCombustivel = tipoCombustivel;
        this.marca = marca;
        this.capacidade = capacidade;
        this.nivelDeCombustivel = nivelDeCombustivel;
        this.estado = estado;
    }

    public String getTipoCombustivel() {
        return tipoCombustivel;
    }

    public void setTipoCombustivel(String tipoCombustivel) {
        this.tipoCombustivel = tipoCombustivel;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public double getCapacidade() {
        return capacidade;
    }

    public void setCapacidade(double capacidade) {
        this.capacidade = capacidade;
    }

    public double verificarNivel() {
        return nivelDeCombustivel;
    }

    public void setNivelDeCombustivel(double nivelDeCombustivel) {
        this.nivelDeCombustivel = nivelDeCombustivel;
    }

    public boolean isEstado() {
        return estado;
    }

    //métodos com integração
    public boolean ligar() {
        return this.nivelDeCombustivel > 0.5;
    }

    public boolean desligar() {
        return false;
    }

    public void abastecer(double quantidade){
        this.setNivelDeCombustivel(verificarNivel() + quantidade);
    }

    public void substituirTanque(){
        System.out.println("Tanque de combustível substituído!");
    }
}
