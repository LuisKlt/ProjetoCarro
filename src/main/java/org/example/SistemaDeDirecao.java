package org.example;

public class SistemaDeDirecao {

    private String tipo;
    private String material;
    private String marca;
    private boolean assistido;
    private double relacao;
    private double angulo;

    public SistemaDeDirecao(String tipo, String material, String marca, boolean assistido, double relacao, double angulo) {
        this.tipo = tipo;
        this.material = material;
        this.marca = marca;
        this.assistido = assistido;
        this.relacao = relacao;
        this.angulo = angulo;
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

    public double getRelacao() {
        return relacao;
    }

    public void setRelacao(double relacao) {
        this.relacao = relacao;
    }

    public boolean isAssistido() {
        return assistido;
    }

    public void ativaAssistido(boolean sistemaEletrico) {
        if(sistemaEletrico){
            System.out.println("Direção assistida ativada");
            this.assistido = true;
        }
        else{
            System.out.println("Ligue o sistema elétrico para ativar a direção assistida");
        }
    }
    public void desativaAssistido() {
        System.out.println("Direção assistida desativada");
        this.assistido = false;
    }

    public double getAngulo() {
        return angulo;
    }

    public void ajustarDirecao(double angulo){
        if (angulo < -450){
            System.out.println("Ângulo mínimo é -450º, ângulo atual: "+this.angulo);
        }
        else if (angulo > 450){
            System.out.println("Ângulo máximo é 450º, ângulo atual: "+this.angulo);
        }
        else{
            System.out.println("Ângulo ajustado, novo ângulo: "+angulo);
            this.angulo = angulo;
        }
    }

    public void substituirComponente(String componente){
        System.out.println("O componente "+componente+" foi substituído!");
    }

}
