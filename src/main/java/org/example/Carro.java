package org.example;

public class Carro {
    private String modelo;
    private String cor;
    private String placa;
    private int ano;
    private double quilometragem;
    private boolean ligado;
    private boolean movimento;

    public Carro(String modelo, String cor, String placa, int ano, double quilometragem, boolean ligado, boolean movimento) {
        this.modelo = modelo;
        this.cor = cor;
        this.placa = placa;
        this.ano = ano;
        this.quilometragem = quilometragem;
        this.ligado = ligado;
        this.movimento = movimento;
    }

    public boolean isMovimento() {
        return movimento;
    }
    public void setMovimento(boolean movimento) {
        this.movimento = movimento;
    }
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
    public boolean isLigado() {
        return this.ligado;
    }

    public void acelerar(boolean carro, boolean freio){
        if (carro && !freio){
            System.out.println("Acelerando, carro em movimento");
            this.setQuilometragem(this.quilometragem + 100);
            this.setMovimento(true);
        }
        else if(!carro){
            System.out.println("Não é possível acelerar com o carro desligado");
            this.setMovimento(false);
        }
        else{
            System.out.println("Não é possível acelerar com o freio acionado");
            this.setMovimento(false);
        }
    }
    public void parar(){
        System.out.println("O carro parou");
        this.setMovimento(false);
    }

    public boolean ligar(boolean sistemaEletrico, int sistemaDeTransmissao, boolean motor, boolean freio, boolean carro) {
        if(sistemaEletrico && sistemaDeTransmissao == 0 && motor && freio && !carro) {
            System.out.println("Carro ligado");
            return this.ligado = true;
        }
        else if(!sistemaEletrico){
            System.out.println("Verifique o sistema elétrico");
            return this.ligado = false;
        }
        else if(sistemaDeTransmissao != 0){
            System.out.println("Sistema de transmissão precisa estar em neutro (marcha = 0)");
            return this.ligado = false;
        }
        else if(!motor){
            System.out.println("Verifique o motor");
            return this.ligado = false;
        }
        else if(!freio){
            System.out.println("Verifique o freio");
            return this.ligado = false;
        }
        else{
            System.out.println("Carro já esta ligado");
            return this.ligado = true;
        }
    }
    public boolean desligar(boolean freio, boolean carroMovimento) {
        if(freio && !carroMovimento) {
            System.out.println("Carro desligado");
            return this.ligado = false;
        }
        else if(!freio){
            System.out.println("Acione o freio para desligar");
            return this.ligado = true;
        }
        else{
            System.out.println("Pare o carro para desligar");
            return this.ligado = true;
        }
    }

}
