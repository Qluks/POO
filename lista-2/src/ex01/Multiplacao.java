package ex01;

public class Multiplacao extends OpecaoMatematica{
    public Multiplacao(double a, double b) {
        super(a, b);
    }

    @Override
    public double calcula() {
        return(getA() * getB());
    }
}
