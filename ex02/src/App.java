import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

	Scanner sc = new Scanner(System.in);

	System.out.print("Altura da Lata:\t");
	double altura	= sc.nextDouble();
	System.out.print("Raio da Lata:\t");
	double raio	= sc.nextDouble();

	double volume = 3.14259 * raio * raio * altura;	

	System.out.println("\nVolume da Lata:\t" + volume);
    }
}
