import java.util.Scanner;

public class App {
	public static void main(String[] args) throws Exception {
		Scanner	sc = new Scanner(System.in);
		
		System.out.print("Qual o tempo gasto na viagem: ");
		double tempo 		= Double.parseDouble(sc.nextLine());

		System.out.print("Qual a velocidade media: ");
		double velocidade 	= Double.parseDouble(sc.nextLine());

		double distancia 	= tempo * velocidade;
		double litros 		= distancia / 12;


		System.out.println("A velocidade media foi de:\t\t " + velocidade + " km/h");
		System.out.println("O tempo gasto na viagem foi de:\t\t " + tempo + " horas");
		System.out.println("A distancia percorrida foi de:\t\t " + distancia + " km");
		System.out.println("A quantidade de litros gastos foi de:\t " + litros + " litros");
	}
}
