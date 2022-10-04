package Ex02.Ex02_B;

public class Miseravel extends Pessoa{
    public Miseravel (String nome, int idade) {
        super(nome, idade);
    }

    public void mendiga() {
        System.out.println("Meu nome é " + super.getNome() + " e eu tenho " + super.getIdade() + " anos de idade, e eu podia estar matando, podia estar robando, mas estou pedindo humildimente por uma ajuda.");
    
    }
}
