package ex03;

public class Divisao2 implements OperacaoMatematica2 {

    public Divisao2 (int a, int b) {  
    }

    @Override
    public double calcula(int a, int b) {
        return (a / b);
    }
    
}
