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

    public void atualizaInfo(String display) {
        this.display = display;
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

    public void ligarDisplay() {
        this.estado = true;
    }

    public void desligarDisplay() {
        this.estado = false;
    }

}
