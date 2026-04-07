import java.util.Scanner;

public class Estruturadecisao {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite a quantidade em estoque: ");
        int quant = sc.nextInt();

        if (quant < 1) {
            System.out.println("Status: Em Falta.");
        } else if (quant < 5) {
            System.out.println("Status: Alerta de estoque baixo.");
        } else {
            System.out.println("Status: Estoque OK.");
        }
        sc.close();
    }
}
