import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Questao10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
        formato.setLenient(false);

        System.out.print("Digite uma data (dd/MM/aaaa): ");
        String texto = sc.nextLine();

        try {
            Date data = formato.parse(texto);

            System.out.println("Data valida: " + formato.format(data));

        } catch (ParseException e) {
            System.out.println("Erro: formato de data invalido.");
        }

        sc.close();
    }
}
