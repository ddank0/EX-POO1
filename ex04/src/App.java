import java.util.Scanner;

public class App {
	public static void main(String[] args) throws Exception {

		Scanner sc = new Scanner(System.in);

		System.out.print("Digite a quantidade em reais:\t");
		double reais = sc.nextDouble();

		double dollar = 4.98;

		System.out.printf("reais equivalem a $%.2f %n", (reais / dollar));

	}
}
