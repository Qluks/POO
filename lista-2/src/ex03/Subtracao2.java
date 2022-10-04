package ex03;

public class Subtracao2 implements OperacaoMatematica2{

    public Subtracao2 (int a, int b) {  
    }

    @Override
    public double calcula(int a, int b) {
        return (a - b);
    }
}
