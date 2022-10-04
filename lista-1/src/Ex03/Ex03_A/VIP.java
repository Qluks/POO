package Ex03.Ex03_A;

import Ex03.Ingresso;

public class VIP extends Ingresso{
    private double valor_adicional = 20.0;

    public VIP(double valor) {
        super(valor);
        this.valor_adicional = valor_adicional;
    }

    public double getValorAdicional() {
        return valor_adicional;
    }

    public void setValorAdicional(double valorAdicional) {
        this.valor_adicional = valorAdicional;
    }

    public double valorAdicional() {
        return super.getValor() + valor_adicional;
    }
}
