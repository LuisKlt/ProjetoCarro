package org.example;

public class Freios {
    private String tipo;
    private String material;
    private String marca;
    private double tamanho;
    private double nivelDeDesgaste;
    private boolean acionado;

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public double getTamanho() {
        return tamanho;
    }

    public void setTamanho(double tamanho) {
        this.tamanho = tamanho;
    }

    public double verificarDesgaste() {
        return nivelDeDesgaste;
    }

    public void setNivelDeDesgaste(double nivelDeDesgaste) {
        this.nivelDeDesgaste = nivelDeDesgaste;
    }

    public void substituirPastilhas(){
        System.out.println("Pastilhas substituídas!");
    }

    public void ajustarFreio(){
        System.out.println("Freio ajustado!");
    }

    public boolean isAcionado() {
        return acionado;
    }

    public void setAcionado(boolean acionado) {
        this.acionado = acionado;
    }
}
