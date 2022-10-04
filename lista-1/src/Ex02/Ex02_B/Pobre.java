package Ex02.Ex02_B;

public class Pobre extends Pessoa {
    public Pobre (String nome, int idade) {
        super(nome, idade);
    }

    public void trabalha() {
        System.out.println("Meu nome é " + super.getNome() + " e eu tenho " + super.getIdade() + " anos de idade, e eu trabalho 12h e recebo um salário mínimo.");
    
    }
}
