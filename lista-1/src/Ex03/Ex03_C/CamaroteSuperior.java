package Ex03.Ex03_C;

import Ex03.Ex03_A.VIP;

public class CamaroteSuperior extends VIP {
    private double valor_adicional = 20.0;

    public CamaroteSuperior(double valor) {
        super(valor);
        this.valor_adicional = valor_adicional;
    }

    @Override
    public double valorAdicional() {
        return this.getValor() + super.getValorAdicional() + valor_adicional;
    }
}
