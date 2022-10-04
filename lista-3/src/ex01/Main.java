package ex01;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner menu = new Scanner(System.in)) {
            Funcionario g = new Gerente("Lucas", 3000);
            Funcionario p = new Programador("Marcos", 2500);
            Funcionario ads = new AnalistaDeSistemas("Medeiros", 2000);

            while (true) {
                System.out.print("\n\n##------- Menu --------##\n\n");
                System.out.print("|-----------------------------|\n");
                System.out.print("| Opção 1 - Imprimir dados    |\n");
                System.out.print("| Opção 2 - Aumentar salário  |\n");
                System.out.print("| Opção 3 - Sair              |\n");
                System.out.print("|-----------------------------|\n");
                System.out.print("Digite uma opção: ");

                int opcao = menu.nextInt();

                if (opcao == 3) {
                    System.out.print("\nAté logo!");
                    break;
                }

                switch (opcao) {
                    case 1:
                        while (true) {
                            System.out.print("\n\n##------- Menu ---------##\n\n");
                            System.out.print("|------------------------------|\n");
                            System.out.print("| Opção 1 - Gerente            |\n");
                            System.out.print("| Opção 2 - Programador        |\n");
                            System.out.print("| Opção 3 - AnalistaDeSistemas |\n");
                            System.out.print("| Opção 4 - Sair               |\n");
                            System.out.print("|------------------------------|\n");
                            System.out.print("Digite uma opção: ");

                            int opcaoImprimirDados = menu.nextInt();

                            if (opcaoImprimirDados == 4) {
                                System.out.print("\nAté logo!");
                                break;
                            }

                            switch (opcaoImprimirDados) {
                                case 1:
                                    System.out.println("Nome do Gerente: " + g.getNome());
                                    System.out.println("Salário do Gerente: " + g.getSalario());
                                    break;

                                case 2:
                                    System.out.println("Nome do Programador: " + p.getNome());
                                    System.out.println("Salário do Programador: " + p.getSalario());
                                    break;

                                case 3:
                                    System.out.println("Nome do AnalistaDeSistemas: " + ads.getNome());
                                    System.out.println("Salário do AnalistaDeSistemas: " + ads.getSalario());
                                    break;

                                default:
                                    System.out.print("\nOpção Inválida!");
                                    break;
                            }
                        }
                        break;

                    case 2:
                        while (true) {
                            System.out.print("\n\n##------- Menu ---------##\n\n");
                            System.out.print("|------------------------------|\n");
                            System.out.print("| Opção 1 - Gerente            |\n");
                            System.out.print("| Opção 2 - Programador        |\n");
                            System.out.print("| Opção 3 - AnalistaDeSistemas |\n");
                            System.out.print("| Opção 4 - Sair               |\n");
                            System.out.print("|------------------------------|\n");
                            System.out.print("Digite uma opção: ");

                            int opcaoMenu = menu.nextInt();

                            if (opcaoMenu == 4) {
                                System.out.print("\nAté logo!");
                                break;
                            }

                            switch (opcaoMenu) {
                                case 1:
                                    g.aumentaSalario();
                                    System.out.println("O salário do Gerente aumentado em 10%: " + g.getSalario());
                                    break;

                                case 2:
                                    p.aumentaSalario();
                                    System.out.println("O salário do Programador aumentado em 20%: " + p.getSalario());
                                    break;

                                    case 3:
                                    ads.aumentaSalario();
                                    System.out.println("O salário do AnalistaDeSistemas aumentado em 5%: " + ads.getSalario());
                                    break;

                                default:
                                    System.out.print("\nOpção Inválida!");
                                    break;
                            }
                        }
                        break;

                    default:
                        System.out.print("\nOpção Inválida!");
                        break;
                }

            }
        }
    }
}
