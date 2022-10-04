package ex01;

public class Divisao extends OpecaoMatematica {
    public Divisao(double a, double b) {
        super(a, b);
    }

    @Override
    public double calcula() {
        return (getA() / getB());
    }
}
