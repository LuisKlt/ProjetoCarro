package org.example;

public class Luzes {
    private String tipo;
    private int intensidade;
    private String cor;
    private boolean estado;
    private String modelo;


    public Luzes(boolean estado){
        this.estado = estado;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getIntensidade() {
        return intensidade;
    }

    public void setIntensidade(int intensidade) {
        this.intensidade = intensidade;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public boolean isestado() {
        return estado;
    }

    public void setestado(boolean estado) {
        this.estado = estado;
    }

    //Método toString
    public String toString(){
        String result=" ";

        if(this.estado==true)	result += "\tLuzes ligadas!\n";
        else result+= "\tLuzes apagadas!\n";

        return result;
    }

    //Ligar
    public void Ascender(){
        setestado(true);
    }

    //Desligar
    public void Apagar(){
        setestado(false);
    }

}
