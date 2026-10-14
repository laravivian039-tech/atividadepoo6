import java.util.Scanner;

public class Questao3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] numeros = {10, 20, 30, 40, 50};

        try {
            System.out.print("Digite o indice de 0 a 4: ");
            int indice = Integer.parseInt(sc.nextLine());

            System.out.println("Elemento: " + numeros[indice]);

        } catch (NumberFormatException e) {
            System.out.println("Erro: digite um numero inteiro.");

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Erro: indice invalido.");
        }

        sc.close();
    }
}