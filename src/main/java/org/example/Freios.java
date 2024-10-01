package org.example;

public class Freios {
    private String tipo;
    private String material;
    private String marca;
    private double tamanho;
    private double nivelDeDesgaste;
    private boolean acionado;

    public Freios(String tipo, String material, String marca, double tamanho, double nivelDeDesgaste, boolean acionado) {
        this.tipo = tipo;
        this.material = material;
        this.marca = marca;
        this.tamanho = tamanho;
        this.nivelDeDesgaste = nivelDeDesgaste;
        this.acionado = acionado;
    }

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
    public boolean isAcionado() {
        return acionado;
    }

    public void acionaFreio() {
        System.out.println("Freio acionado, desgaste aumentou");
        this.setNivelDeDesgaste(this.verificarDesgaste() - 1);
        this.acionado = true;
    }

    public void desacionaFreio() {
        this.acionado = false;
    }

    public void substituirPastilhas(){
        System.out.println("Pastilhas substituídas!");
    }

    public void ajustarFreio(){
        System.out.println("Freio ajustado!");
    }
}
