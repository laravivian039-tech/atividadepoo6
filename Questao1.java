import java.util.Scanner;

public class Questao1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Digite o primeiro numero inteiro: ");
            int num1 = Integer.parseInt(sc.nextLine());

            System.out.print("Digite o segundo numero inteiro: ");
            int num2 = Integer.parseInt(sc.nextLine());

            int resultado = num1 / num2;

            System.out.println("Resultado: " + resultado);

        } catch (ArithmeticException e) {
            System.out.println("Erro: nao e possivel dividir por zero.");

        } catch (NumberFormatException e) {
            System.out.println("Erro: digite apenas numeros inteiros.");
        }

        sc.close();
    }
}