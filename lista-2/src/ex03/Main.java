package ex03;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner menu = new Scanner(System.in)) {
            try (Scanner num = new Scanner(System.in)) {
                
                Soma2 soma2 = new Soma2(0, 0);
                Subtracao2 subtracao2 = new Subtracao2(0, 0);
                Divisao2 divisao2 = new Divisao2(0, 0);
                Multiplicacao2 multiplicacao2 = new Multiplicacao2(0, 0);

                System.out.println("Digite o primeiro número da operação: ");
                int a = num.nextInt();

                System.out.println("\nDigite o segundo número da operação: ");
                int b = num.nextInt();

                while (true) {
                    System.out.print("\n\n##-- Menu de operações --##\n\n");
                    System.out.print("|-----------------------------|\n");
                    System.out.print("| Opção 1 - Somar             |\n");
                    System.out.print("| Opção 2 - Subtrair          |\n");
                    System.out.print("| Opção 3 - Dividir           |\n");
                    System.out.print("| Opção 4 - Multiplicar       |\n");
                    System.out.print("| Opção 5 - Sair              |\n");
                    System.out.print("|-----------------------------|\n");
                    System.out.print("Digite uma opção: ");

                    int opcao = menu.nextInt();

                    if (opcao == 5) {
                        System.out.print("\nAté logo!");
                        break;
                    }

                    switch (opcao) {
                        case 1:
                            System.out.print("\nA soma dos números é igual a: " + soma2.calcula(a, b));
                            break;

                        case 2:
                            System.out.print("\nA subtração dos números é igual a: " + subtracao2.calcula(a, b));
                            break;

                        case 3:
                            System.out.print("\nA divisão dos números é igual a: " + divisao2.calcula(a, b));
                            break;

                        case 4:
                            System.out.print("\nA multiplicação dos números é igual a: " + multiplicacao2.calcula(a, b));
                            break;

                        default:
                            System.out.print("\nOpção Inválida!");
                            break;
                    }
                }
            }
        }

    }
}
