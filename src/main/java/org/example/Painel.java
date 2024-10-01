package org.example;

public class Painel {
    private String tipo;
    private String display;
    private String marca;
    private boolean controle;
    private boolean estado;

    public Painel(String tipo, String display, String marca, boolean controle, boolean estado) {
        this.tipo = tipo;
        this.display = display;
        this.marca = marca;
        this.controle = controle;
        this.estado = estado;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getDisplay() {
        return display;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public boolean isControle() {
        return controle;
    }

    public void setControle(boolean controle) {
        this.controle = controle;
    }

    public boolean isEstado() {
        return estado;
    }

    //métodos com integração
    public String atualizaInfo(double banco, int luzes, double pneus, double sistemaDirecao, double suspencao) {
        return this.display =
                "\nAltura do banco: "+banco+
                "\nIntensidade das luzes: "+luzes+
                "\nPressão dos pneus: "+pneus+
                "\nÂngulo da Direção: "+sistemaDirecao+
                "\nAltura da suspenção: "+suspencao;
    }

    public boolean ligarDisplay(boolean sistemaEletrico) {
        if (sistemaEletrico){
            System.out.println("Display ligado");
            return this.estado = true;
        }
        else{
            System.out.println("");
            return this.estado = false;
        }
    }

    public void desligarDisplay() {
        this.estado = false;
    }

}
