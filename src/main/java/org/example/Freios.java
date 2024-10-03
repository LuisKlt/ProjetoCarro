package org.example;

public class Freios {

    private Carro carro = new Carro("BMW M3", "Azul", "AAA-111", 2022, 15050, false, false);
    private Pneus pneus = new Pneus("255/35R19", "Radial", "Toyo", "Novo", 22.9);
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

    public String getAcionado(boolean freio){
        if (freio){
            return "Acionado";
        }
        else{
            return "Desacionado";
        }
    }

    public void acionaFreio(boolean carroMovimento){
        if(carroMovimento){
            System.out.println("Freio acionado, desgaste aumentou");
            this.setNivelDeDesgaste(this.verificarDesgaste() - 1);
            this.acionado = true;
            carro.parar();
            pneus.ajustarPressao(pneus.getPressao()+0.2);
        }
        else{
            System.out.println("Freio acionado");
            this.acionado = true;
        }
    }

    public void desacionaFreio() {
        System.out.println("Freio desacionado");
        this.acionado = false;
    }
}