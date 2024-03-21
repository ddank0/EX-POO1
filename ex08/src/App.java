import java.util.Calendar;
import java.util.Scanner;

public class App {
	public static void main(String[] args) throws Exception {

		Scanner sc = new Scanner(System.in);

		System.out.print("Digite o mes (1-12): ");
		int month = sc.nextInt();

		Calendar calendar = Calendar.getInstance();

		calendar.set(Calendar.MONTH, month-1);
		calendar.set(Calendar.YEAR, 2024);

		int dayOfMonth = calendar.getActualMaximum(Calendar.DAY_OF_MONTH);

		switch (month) {
			case 1:
				System.out.println("Janeiro tem " + dayOfMonth + " dias");
				break;
			case 2:			
				System.out.println("Fevereiro tem " + 28 + " dias");
				break;
			case 3:
				System.out.println("Março tem " + dayOfMonth + " dias");
				break;
			case 4:
				System.out.println("Abril tem " + dayOfMonth + " dias");
				break;
			case 5:
				System.out.println("Maio tem " + dayOfMonth + " dias");
				break;
			case 6:
				System.out.println("Junho tem " + dayOfMonth + " dias");
				break;	
			case 7:
				System.out.println("Julho tem " + dayOfMonth + " dias");
				break;
			case 8:
				System.out.println("Agosto tem " + dayOfMonth + " dias");
				break;
			case 9:
				System.out.println("Setembro tem " + dayOfMonth + " dias");
				break;
			case 10:
				System.out.println("Outubro tem " + dayOfMonth + " dias");
				break;
			case 11:
				System.out.println("Novembro tem " + dayOfMonth + " dias");
				break;
			case 12:
				System.out.println("Dezembro tem " + dayOfMonth + " dias");
				break;
			default:
				System.out.println("Mês inválido");
				break;
		}
	}
}
