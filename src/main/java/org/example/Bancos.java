package org.example;

public class Bancos {

    private int quantidade;
    private String material;
    private String cor;
    private String tipo;
    private String estado;
    private String posicao;
    private double altura;

    public Bancos(int quantidade, String material, String cor, String tipo, String estado, String posicao, double altura) {
        this.quantidade = quantidade;
        this.material = material;
        this.cor = cor;
        this.tipo = tipo;
        this.estado = estado;
        this.posicao = posicao;
        this.altura = altura;
    }

    public int getQuantidade() {
        return quantidade;
    }
    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }
    public String getMaterial() {
        return material;
    }
    public void setMaterial(String material) {
        this.material = material;
    }
    public String getCor() {
        return cor;
    }
    public void setCor(String cor) {
        this.cor = cor;
    }
    public String getTipo() {
        return tipo;
    }
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    public String getPosicao() {
        return posicao;
    }
    public void setPosicao(String posicao) {
        this.posicao = posicao;
    }
    public double getAltura() {
        return altura;
    }
    public void setAltura(double altura) {
        this.altura = altura;
    }
    public String getEstado() {
        return estado;
    }
    public void setEstado(String estado) {
        this.estado = estado;
    }

    //métodos com integração
    public String ajustarEncosto(String posicao){
        return posicao;
    }
    public double ajustarAltura(boolean sistemaEletrico, double altura){
        if (sistemaEletrico){
            System.out.println("Nova altura: "+altura);
            return this.altura = altura;
        }
        else{
            System.out.println("Sistema elétrico desativado, altura atual: "+this.altura);
            return this.altura;
        }
    }
}
