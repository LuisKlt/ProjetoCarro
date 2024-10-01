package org.example;

public class Suspencao {
    private String tipo;
    private String material;
    private String marca;
    private double altura;
    private int regidez;

    public Suspencao(String tipo, String material, String marca, double altura, int regidez) {
        this.tipo = tipo;
        this.material = material;
        this.marca = marca;
        this.altura = altura;
        this.regidez = regidez;
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

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public int getRegidez() {
        return regidez;
    }

    public void setRegidez(int regidez) {
        this.regidez = regidez;
    }

    //métodos com integração
    public int verificarEstado(){
        return this.getRegidez();
    }

    public boolean substituirSuspencao(boolean carroMovimento){
        if (carroMovimento){
            System.out.println("Pare o carro para substituir a suspenção");
            return false;
        }
        else{
            System.out.println("Suspenção substituída!");
            return true;
        }
    }

}
