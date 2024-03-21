import java.util.Scanner;

public class App {
	public static void main(String[] args) throws Exception {

		Scanner sc = new Scanner(System.in);

		System.out.print("digite um numero inteiro: ");
		int n1 = sc.nextInt();

		System.out.print("digite um numero inteiro: ");
		int n2 = sc.nextInt();

		if (n1 >= n2 ) {
			System.out.println("Digite o numero menor primeiro");
			System.exit(0);
		}

		for (int i = n1; i <= n2; i++) {
			if (i % 2 == 0)
				System.out.println("\t"+i);
		}

	}
}
