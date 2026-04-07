import java.util.Scanner;

public class Desafio {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o nome do produto: ");
        String nome_prod = sc.nextLine();

        System.out.print("Digite a quantidade em estoque: ");
        int quant_est = sc.nextInt();

        System.out.print("Digite o preço unitário: R$ ");
        double preco_unit = sc.nextDouble();

        if (quant_est > 0) {

            System.out.println("----RESUMO DO PRODUTO----");
            System.out.println("Produto: " + nome_prod);
            System.out.println("Quantidade: " + quant_est);
            System.out.println("Preço: R$ " + preco_unit);

        } else {
            System.out.println("ERRO: A quantidade não pode ser um valor negativo. Por favor, tente novamente.");
        }

        sc.close();
    }

}
