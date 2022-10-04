package ex01;

public class Soma extends OpecaoMatematica{
    public Soma(double a, double b) {
        super(a, b);
    }

    @Override
    public double calcula() {
        return (getA() + getB());
    }
}
