package Ex04.Ex04_B;

import Ex04.Imovel;

public class Velho extends Imovel {
    private double desconto = -20.0;

    public Velho(String endereco, double preco) {
        super(endereco, preco);
        this.desconto = desconto;
    }

    public double getDesconto() {
        return desconto;
    }

    public void setDesconto(double desconto) {
        this.desconto = desconto;
    }

    public void imprimeDesconto() {
        System.out.println(super.getPreco() - desconto);
    }
}
