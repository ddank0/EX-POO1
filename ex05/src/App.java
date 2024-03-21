import java.util.Scanner;

public class App {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);

		System.out.print("Numero do do vendedor:\t\t");
		int numero = sc.nextInt();

		System.out.print("Salario fixo do vendedor:\t");
		double salarioFixo = sc.nextDouble();

		System.out.print("Total de vendas do vendedor:\t");
		double totalVendas = sc.nextDouble();

		System.out.print("Comissao do vendedor:\t\t");
		double comissao = sc.nextDouble();

		double salarioFinal = salarioFixo + (totalVendas * comissao);

		System.out.println("O salario final do vendedor " + numero + " eh: " + salarioFinal);

	}
}
