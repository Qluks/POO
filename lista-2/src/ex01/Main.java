package ex01;

public class Main {
    public static void main(String[] args) {
        OpecaoMatematica soma = new Soma(2, 2);
        System.out.println("2 + 2 = " + soma.calcula());

        OpecaoMatematica subtracao = new Subtracao(2, 2);
        System.out.println("2 - 2 = " + subtracao.calcula());

        OpecaoMatematica multiplicacao = new Multiplacao(2, 2);
        System.out.println("2 * 2 = " + multiplicacao.calcula());

        OpecaoMatematica divisao = new Divisao(2, 2);
        System.out.println("2 / 2 = " + divisao.calcula());
    }
}
