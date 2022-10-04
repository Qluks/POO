package ex03;

public class Soma2 implements OperacaoMatematica2 {

    public Soma2 (int a, int b) {  
    }

    @Override
    public double calcula(int a, int b) {
        
        return (a + b);
    }
}
