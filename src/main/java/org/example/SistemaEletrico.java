package org.example;

public class SistemaEletrico {

    private double voltagem;
    private double capacidade;
    private String tipoDeBateria;
    private String marca;
    private boolean estado;
    private boolean trava;

    public SistemaEletrico(double voltagem, double capacidade, String tipoDeBateria, String marca, boolean estado, boolean trava) {
        this.voltagem = voltagem;
        this.capacidade = capacidade;
        this.tipoDeBateria = tipoDeBateria;
        this.marca = marca;
        this.estado = estado;
        this.trava = trava;
    }

    public boolean isTrava() {
        return trava;
    }
    public void liberaTrava() {
        System.out.println("Trava liberada");
        this.trava = false;
    }
    public void acionaTrava() {
        System.out.println("Trava acionada");
        this.trava = true;
    }
    public double getVoltagem() {
        return voltagem;
    }

    public void setVoltagem(double voltagem) {
        this.voltagem = voltagem;
    }

    public double getCapacidade() {
        return capacidade;
    }

    public void setCapacidade(double capacidade) {
        this.capacidade = capacidade;
    }

    public String getTipoDeBateria() {
        return tipoDeBateria;
    }

    public void setTipoDeBateria(String tipoDeBateria) {
        this.tipoDeBateria = tipoDeBateria;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public boolean getBateria() {
        return this.estado;
    }

    public boolean ligar(boolean testarSistema) {
        if(testarSistema){
            System.out.println("Sistema elétrico ligado");
            return this.estado = true;
        }
        else{
            System.out.println("Verifique o sistema eletrico. Sistema elétrico desligado");
            return this.estado = false;
        }
    }

    public void desligar() {
        this.estado = false;
    }

    //métodos com integração
    public String substituirBateria(boolean carroLigado){
        if (!carroLigado) {
            this.setCapacidade(100);
            this.setVoltagem(14.0);
            System.out.println("Bateria substituída");
            return "Concluída";
        }
        else {
            System.out.println("Não é possível substituir a bateria com o carro ligado");
            return "Falha";
        }
    }

    public boolean testarSistema(){
        if (this.getVoltagem() >= 13.8 && this.getVoltagem() < 14.4 && this.getCapacidade() > 0){
            System.out.println("Sistema Elétrico OK");
            return true;
        }
        else if(this.getCapacidade() == 0){
            System.out.println("Bateria descarregada");
            return false;
        }
        else{
            System.out.println("Voltagem incorreta");
            return false;
        }
    }

}
