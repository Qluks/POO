package ex03;

public class Multiplicacao2 implements OperacaoMatematica2{
    public Multiplicacao2 (int a, int b) {  
    }

    @Override
    public double calcula(int a, int b) {
        return (a * b);
    }
}
