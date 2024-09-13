package org.example;

public class SistemaDeTransmissao {

    private String tipo;
    private String material;
    private String marca;
    private int numeroDeMarchas;
    private boolean estado;
    private int marcha;

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

    public int getNumeroDeMarchas() {
        return numeroDeMarchas;
    }

    public void setNumeroDeMarchas(int numeroDeMarchas) {
        this.numeroDeMarchas = numeroDeMarchas;
    }

    public boolean verificarEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }



    public int getMarcha() {
        return marcha;
    }

    public void setMarcha(int marcha) {
        this.marcha = marcha;
    }

    public void trocarMarcha(int marcha){
        this.setMarcha(marcha);
    }

    public void substituirComponente(String componente){
        System.out.println("O componente "+componente+" foi substituído!");
    }

}
