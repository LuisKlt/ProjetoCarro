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
        return this.display;
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
    public String atualizaInfo(String carroModelo, double bancoAltura, int luzesIntensidade, double pneusPressao, double sistemaDirecao,
                               double suspencao, String freio, int motorPotencia, double combusitivel, int transmissao, String porta) {
        if(carroModelo != null){
            System.out.println("Display atualizado");
            return this.display =
                    "\n----------------------------"+
                            "\nDisplay "+carroModelo+
                            "\n----------------------------"+
                            "\nAltura do banco: "+bancoAltura+"Cm"+
                            "\nIntensidade das luzes: "+luzesIntensidade+
                            "\nPressão dos pneus: "+pneusPressao+"Psi"+
                            "\nÂngulo da Direção: "+sistemaDirecao+"º"+
                            "\nAltura da suspenção: "+suspencao+"Cm"+
                            "\nFreio: "+freio+
                            "\nPotência do motor: "+motorPotencia+"HP"+
                            "\nCombustivel: "+combusitivel+" Litros"+
                            "\nMarcha atual: "+transmissao+
                            "\nPorta: "+porta+
                            "\n----------------------------";
        }
        else{
            System.out.println("Nome do carro não encontrado");
            return null;
        }

    }

    public boolean ligarDisplay(boolean sistemaEletrico) {
        if (sistemaEletrico){
            System.out.println("Display ligado");
            return this.estado = true;
        }
        else{
            System.out.println("Verifique o sistema elétrico, Display desligado");
            return this.estado = false;
        }
    }

    public void desligarDisplay() {
        this.estado = false;
    }

}
