package ex01;

public class Subtracao extends OpecaoMatematica{
    public Subtracao(double a, double b) {
        super(a, b);
    }

    @Override
    public double calcula() {
        return(getA() - getB());
    }
}
