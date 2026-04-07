import java.util.Scanner;
import java.util.Locale;

public class ROI {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("--- Calculadora de ROI (Java) ---");

        System.out.print("Digite o lucro: ");
        double lucro = sc.nextDouble();

        System.out.print("Digite o investimento: ");
        double investimento = sc.nextDouble();

        if (investimento == 0) {
            System.out.println("Erro: investimento não pode ser zero!");
        } else {
            double roi = ((lucro - investimento) / investimento) * 100;
            System.out.printf("ROI: %.2f%%", roi);
        }

        sc.close();
    }
}