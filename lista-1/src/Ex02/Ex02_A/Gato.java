package Ex02.Ex02_A;

public class Gato extends Animal {
    public Gato (String nome, String raca) {
        super(nome, raca);
    }

    public void miar() {
        System.out.println(this.getNome() + " está miando.");
    }
}
