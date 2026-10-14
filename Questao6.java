import java.util.Scanner;

public class Questao6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Digite o primeiro numero: ");
            double num1 = Double.parseDouble(sc.nextLine());

            System.out.print("Digite a operacao (+, -, *, /): ");
            String operacao = sc.nextLine();

            System.out.print("Digite o segundo numero: ");
            double num2 = Double.parseDouble(sc.nextLine());

            switch (operacao) {
                case "+":
                    System.out.println("Resultado: " + (num1 + num2));
                    break;

                case "-":
                    System.out.println("Resultado: " + (num1 - num2));
                    break;

                case "*":
                    System.out.println("Resultado: " + (num1 * num2));
                    break;

                case "/":
                    if (num2 == 0) {
                        System.out.println("Erro: divisao por zero.");
                    } else {
                        System.out.println("Resultado: " + (num1 / num2));
                    }
                    break;

                default:
                    System.out.println("Erro: operacao invalida.");
            }

        } catch (NumberFormatException e) {
            System.out.println("Erro: digite numeros validos.");
        }

        sc.close();
    }
}
