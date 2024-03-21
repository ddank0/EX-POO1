import java.util.Scanner;

public class App {
	public static void main(String[] args) throws Exception {

		Scanner sc = new Scanner(System.in);

		System.out.print("Digite um numero: ");

		int numero = sc.nextInt();

		if (numero % 4 == 0 && numero % 3 == 0) {
			System.out.println("O numero " + numero + " é divisivel por 3 e 4");
		} else {
			System.out.println("O numero " + numero + " não é divisivel por 3 e 4");
		}

	}
}
