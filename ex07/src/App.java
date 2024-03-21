import java.util.Scanner;

public class App {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);

		System.out.print("Digite a idade do jogador: ");
		int idade = sc.nextInt();

		if (idade <= 10) {
			System.out.println("Categoria: Mirim");

		} else if (10 < idade && idade <= 18) {
			System.out.println("Categoria: Juvenil");

		} else if (18 < idade && idade <= 40) {
			System.out.println("Categoria: Adulto");

		} else {

			System.out.println("Categoria: Master");
		}
	}
}
