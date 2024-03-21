import java.util.Scanner;

public class App {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);

		System.out.print("Digite um numero: ");
		int num = sc.nextInt();

		while (num != -1) {

			if (num % 2 == 0 && num % 3 == 0) {
				System.out.println("O numero " + num + " é múltiplo de 2 e 3");
			} else {
				System.out.println("O numero " + num + " não é múltiplo de 2 e 3");
			}

			System.out.print("Digite um numero: ");
			num = sc.nextInt();
		}
	}
}
