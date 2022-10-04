package Ex02.Ex02_B;

public class Rica extends Pessoa {

    private double dinheiro;

    public Rica (String nome, int idade) {
        super(nome, idade);
    }

    public void fazCompras() {
        System.out.println("Meu nome é " + super.getNome() + ", meu orçamento atual é de " + dinheiro + " e eu tenho " + super.getIdade() + " anos de idade, e estou fazendo compras.");
    }
}
