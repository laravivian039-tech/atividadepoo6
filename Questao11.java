import java.util.ArrayList;
import java.util.Scanner;

public class Questao11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> nomes = new ArrayList<>();

        while (true) {
            System.out.println("1 - Adicionar nome");
            System.out.println("2 - Remover nome");
            System.out.println("3 - Acessar nome");
            System.out.println("4 - Listar nomes");
            System.out.println("5 - Sair");
            System.out.print("Escolha uma opcao: ");

            try {
                int opcao = Integer.parseInt(sc.nextLine());

                if (opcao == 1) {
                    System.out.print("Digite o nome: ");
                    String nome = sc.nextLine();

                    System.out.print("Digite o indice: ");
                    int indice = Integer.parseInt(sc.nextLine());

                    nomes.add(indice, nome);
                    System.out.println("Nome adicionado!");

                } else if (opcao == 2) {
                    System.out.print("Digite o indice para remover: ");
                    int indice = Integer.parseInt(sc.nextLine());

                    nomes.remove(indice);
                    System.out.println("Nome removido!");

                } else if (opcao == 3) {
                    System.out.print("Digite o indice para acessar: ");
                    int indice = Integer.parseInt(sc.nextLine());

                    System.out.println("Nome: " + nomes.get(indice));

                } else if (opcao == 4) {
                    System.out.println(nomes);

                } else if (opcao == 5) {
                    break;

                } else {
                    System.out.println("Opcao invalida.");
                }

            } catch (NumberFormatException e) {
                System.out.println("Erro: digite um numero inteiro.");

            } catch (IndexOutOfBoundsException e) {
                System.out.println("Erro: indice invalido.");
            }
        }

        sc.close();
    }
}
