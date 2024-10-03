package org.example;

public class Portas {

    private int quantidade;
    private String material;
    private String cor;
    private String tipo;
    private boolean estado;

    public Portas(int quantidade, String material, String cor, String tipo, boolean estado) {
        this.quantidade = quantidade;
        this.material = material;
        this.cor = cor;
        this.tipo = tipo;
        this.estado = estado;
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

    public String getEstado() {
        if (this.estado){
            return "Aberta";
        }
        else{
            return "Fechada";
        }
    }

    //métodos com integração
    public void abrir(boolean trava){
        if (trava){
            System.out.println("Trava acionada, destrave para abrir");
            this.estado = false;
        }
        else{
            System.out.println("Porta aberta");
            this.estado = true;
        }
    }

    public void fechar(){
        System.out.println("Porta fechada");
        this.estado = false;

    }
}
