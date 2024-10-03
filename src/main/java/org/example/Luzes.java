package org.example;

public class Luzes {
    private String tipo;
    private int intensidade;
    private String cor;
    private boolean estado;
    private String modelo;

    public Luzes(String tipo, int intensidade, String cor, boolean estado, String modelo) {
        this.tipo = tipo;
        this.intensidade = intensidade;
        this.cor = cor;
        this.estado = estado;
        this.modelo = modelo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getIntensidade() {
        return intensidade;
    }

    public void ajustarIntensidade(boolean luzes, int intensidade) {
        if(!luzes){
            System.out.println("Luzes desligadas. Intensidade das luzes não ajustada (intensidade: "+this.intensidade+")");
        }
        else if(intensidade >= 0 && intensidade <= 10){
            System.out.println("Intensidade das luzes ajustada, nova intensidade: "+intensidade);
            this.intensidade = intensidade;
        }
        else{
            System.out.println("O valor '"+intensidade+"' é inválido. Intensidade das luzes não ajustada (intensidade: "+this.intensidade+")");
        }
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    //métodos com integração
    public boolean ligar(boolean sistemaEletrico){
        if(sistemaEletrico){
            System.out.println("Luzes ligadas");
            return this.estado = true;
        }
        else{
            System.out.println("Não é possível ligar as luzes, verifique o sistema elétrico");
            return this.estado = false;
        }
    }

    public void desligar(){
        this.setEstado(false);
    }
}
