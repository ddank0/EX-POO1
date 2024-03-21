import java.util.Scanner;

public class App {
	public static void main(String[] args) throws Exception {

		Scanner sc = new Scanner(System.in);

		System.out.print("Digite o primeiro numero inteiro:\t");
		int n1 = sc.nextInt();

		System.out.print("Digite o segundo numero inteiro:\t");
		int n2 = sc.nextInt();

		int diff = n1 - n2;
		int squareDiff = (n1 * n1) - (n2 * n2);
		
		System.out.println("Quadrado da diferença: " + diff * diff);
		System.out.println("Diferença dos quadrados: " + squareDiff);
		
	}
}
