import java.util.Scanner;

public class Questao12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o CPF (somente numeros): ");
        String cpf = sc.nextLine();

        if (cpf.length() != 11) {
            System.out.println("Erro: o CPF deve ter 11 digitos.");
        } else {
            boolean valido = true;

            for (int i = 0; i < cpf.length(); i++) {
                if (!Character.isDigit(cpf.charAt(i))) {
                    valido = false;
                }
            }

            if (valido) {
                System.out.println("CPF com formato valido.");
            } else {
                System.out.println("Erro: digite somente numeros.");
            }
        }

        sc.close();
    }
}
