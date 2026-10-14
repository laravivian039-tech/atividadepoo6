import java.util.ArrayList;
import java.util.Scanner;

public class Questao9 {

    public static double calcularMedia(ArrayList<Double> numeros) {
        if (numeros == null || numeros.isEmpty()) {
            throw new IllegalArgumentException("A lista esta vazia.");
        }

        double soma = 0;

        for (double numero : numeros) {
            soma += numero;
        }

        return soma / numeros.size();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Double> numeros = new ArrayList<>();

        System.out.println("Digite os numeros ou 'fim' para terminar:");

        while (true) {
            String texto = sc.nextLine();

            if (texto.equalsIgnoreCase("fim")) {
                break;
            }

            try {
                double numero = Double.parseDouble(texto);
                numeros.add(numero);

            } catch (NumberFormatException e) {
                System.out.println("Erro: digite um numero valido.");
            }
        }

        try {
            double media = calcularMedia(numeros);
            System.out.println("Media: " + media);

        } catch (IllegalArgumentException e) {
            System.out.println("Erro: " + e.getMessage());
        }

        sc.close();
    }
}
