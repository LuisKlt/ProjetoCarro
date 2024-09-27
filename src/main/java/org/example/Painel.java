package org.example;

public class Painel {

    private String tipo;
    private String display;
    private String marca;
    private boolean controle;
    private boolean estado;

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getDisplay() {
        return display;
    }

    public String atualizaInfo(double banco, int luzes, double pneus, double sistemaDirecao, double suspencao) {
        return this.display = "Altura do banco: "+banco+
                "\nIntensidade das luzes: "+luzes+
                "\nPressão dos pneus: "+pneus+
                "\nÂngulo da Direção: "+sistemaDirecao+
                "\nAltura da suspenção: "+suspencao;
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

    public boolean ligarDisplay(boolean carro) {
        return this.estado = carro;
    }

    public void desligarDisplay() {
        this.estado = false;
    }

}
