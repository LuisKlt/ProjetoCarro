package org.example;

public class SistemaDeTransmissao {

    private String tipo;
    private String material;
    private String marca;
    private int numeroDeMarchas;
    private boolean estado;
    private int marcha;

    public SistemaDeTransmissao(String tipo, String material, String marca, int numeroDeMarchas, boolean estado, int marcha) {
        this.tipo = tipo;
        this.material = material;
        this.marca = marca;
        this.numeroDeMarchas = numeroDeMarchas;
        this.estado = estado;
        this.marcha = marcha;
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

    public void aumentarMarcha(){
        if(this.marcha > 6){
            System.out.println("Tranmissão já esta na ultíma marcha");
        }
        else{
            int novaMarcha = this.marcha + 1;
            System.out.println("Marcha aumentada, marcha atual: "+novaMarcha);
            this.marcha = novaMarcha;
        }

    }
    public void diminuirMarcha(){
        if(this.marcha < 0){
            System.out.println("Tranmissão já esta no neutro");
        }
        else{
            int novaMarcha = this.marcha - 1;
            System.out.println("Marcha diminuida, marcha atual: "+novaMarcha);
            this.marcha = novaMarcha;
        }
    }

    public void substituirComponente(String componente){
        System.out.println("O componente "+componente+" foi substituído!");
    }

}
