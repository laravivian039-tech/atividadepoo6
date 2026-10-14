public class Questao7 {
    public static void main(String[] args) {
        String[] valores = {"12.5", "7.8", "abc", "20"};

        for (int i = 0; i < valores.length; i++) {
            try {
                double numero = Double.parseDouble(valores[i]);

                System.out.println("Numero: " + numero);

            } catch (NumberFormatException e) {
                System.out.println("Erro: valor invalido.");
            }
        }
    }
}
