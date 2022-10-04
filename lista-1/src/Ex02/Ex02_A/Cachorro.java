package Ex02.Ex02_A;

public class Cachorro extends Animal {

    public Cachorro (String nome, String raca) {
        super(nome, raca);
    }
    
    public void latir() {
        System.out.println(this.getNome() + " está latindo.");
    }
}
