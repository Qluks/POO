package ex02;

public class Retangulo implements FormaGeometrica {
    private double ladoA;
    private double ladoB;

    public Retangulo(double ladoA, double ladoB) {
        this.ladoA = ladoA;
        this.ladoB = ladoB;
    }

    @Override
    public double area() {
        return (ladoA * ladoB);
    }

    @Override
    public double comprimento() {
        return ladoA;
    }
}
