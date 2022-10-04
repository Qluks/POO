package ex02;

public class Main {
    public static void main(String[] args) {
        Circulo c = new Circulo(3);
        System.out.println("\nA área do Cirulo é: " + c.area());
        System.out.println("O comprimento do Circulo é: " + c.comprimento());

        Quadrado q = new Quadrado(3);
        System.out.println("\nA área do Quadrado é: " + q.area());
        System.out.println("O comprimento do Quadrado é: " + q.comprimento());

    }
}
