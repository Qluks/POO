package Ex03.Ex03_B;

import Ex03.Ingresso;

public class Normal extends Ingresso {
    public Normal(double valor) {
        super(valor);
    }

    @Override
    public void imprimeValor() {
        System.out.println(super.getValor());
    }
}
