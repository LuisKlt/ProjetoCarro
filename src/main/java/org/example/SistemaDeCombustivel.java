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


    public double verificarNivel(boolean carroMovimento) {
        if(carroMovimento){
            double nivel = this.nivelDeCombustivel - 10;
            System.out.println("Carro em movimento, nível do combustivel diminuiu para "+nivel);
            return this.nivelDeCombustivel = nivel;
        }
        else{
            System.out.println("Nível de combustível "+this.nivelDeCombustivel);
            return this.nivelDeCombustivel;
        }
    }

    public void setNivelDeCombustivel(double nivelDeCombustivel, double capacidade) {
        if (nivelDeCombustivel > capacidade){
            System.out.println("Nível de combustível não pode ser maior que a capacidade do tanque, nível atual: "+this.nivelDeCombustivel);
        }
        else{
            this.nivelDeCombustivel = nivelDeCombustivel;
        }

    }

    public double getNivel(){
        return this.nivelDeCombustivel;
    }

    public boolean isEstado() {
        return this.estado;
    }

    public boolean ligar() {
        if(nivelDeCombustivel > 0){
            System.out.println("Sistema de combustível ligado");
            return this.estado = true;
        }
        else{
            System.out.println("Sistema de combustível desligado");
            return this.estado = false;
        }
    }

    public boolean desligar() {
        return false;
    }

    public void abastecer(double quantidade, double nivel, double capacidade, boolean carroMovimento){
        if (quantidade + nivel > capacidade){
            System.out.println("Quantidade ultrapassa a capacidade do tanque, impossivel abastecer, nível atual: "+this.nivelDeCombustivel);
        }
        else if(carroMovimento){
            System.out.println("Pare o carro para abastecer, nível atual: "+this.nivelDeCombustivel);
        }
        else{
            double novoNivel = nivel + quantidade;
            System.out.println("Tanque abastecido, nível atual: "+novoNivel);
            this.nivelDeCombustivel = novoNivel;
        }
    }

    public void substituirTanque(){
        System.out.println("Tanque de combustível substituído!");
    }
}
