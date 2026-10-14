import java.util.Scanner;

public class Questao14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o telefone com 9 digitos: ");
        String telefone = sc.nextLine();

        boolean valido = telefone.length() == 9;

        for (int i = 0; i < telefone.length(); i++) {
            if (!Character.isDigit(telefone.charAt(i))) {
                valido = false;
            }
        }

        if (valido) {
            System.out.println("Telefone valido.");
        } else {
            System.out.println("Erro: digite 9 digitos sem letras ou caracteres especiais.");
        }

        sc.close();
    }
}
