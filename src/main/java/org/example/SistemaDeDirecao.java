package org.example;

public class SistemaDeDirecao {

    private String tipo;
    private String material;
    private String marca;
    private boolean assistido;
    private double relacao;
    private double angulo;
    private String estado;

    public double getAngulo() {
        return angulo;
    }

    public void setAngulo(double angulo) {
        this.angulo = angulo;
    }

    public String verificarEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
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

    public boolean isAssistido() {
        return assistido;
    }

    public void setAssistido(boolean assistido) {
        this.assistido = assistido;
    }

    public double getRelacao() {
        return relacao;
    }

    public void setRelacao(double relacao) {
        this.relacao = relacao;
    }

    public void ajustarDirecao(double angulo){
        this.setAngulo(angulo);
    }

    public void substituirComponente(String componente){
        System.out.println("O componente "+componente+" foi substituído!");
    }

}
