import java.util.Scanner;

public class Questao2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um valor: ");
        String texto = sc.nextLine();

        try {
            int numero = Integer.parseInt(texto);

            System.out.println("Numero convertido: " + numero);

        } catch (NumberFormatException e) {
            System.out.println("Erro: digite um numero inteiro valido.");
        }

        sc.close();
    }
}