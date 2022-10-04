package Ex04.Ex04_A;

import Ex04.Imovel;

public class Novo extends Imovel {
    private double precoAdicional = 30;

    public Novo (String endereco, double preco) {
        super(endereco, preco);
        this.precoAdicional = precoAdicional;
    }

    public double getPrecoAdicional() {
        return precoAdicional;
    }

    public void setPrecoAdicional(double precoAdicional) {
        this.precoAdicional = precoAdicional;
    }

    public void imprimePrecoAdicional() {
        System.out.println(super.getPreco() + precoAdicional);
    }
}
