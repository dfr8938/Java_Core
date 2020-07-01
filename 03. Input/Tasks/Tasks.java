import java.util.Scanner;

public class Tasks {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in); 
		
		int x = 0, y = 0;

		System.out.println("x = " + x + "\n" + "y = " + y);

		System.out.print("Введите x: ");
		x = scanner.nextInt();

		System.out.print("Введите y: ");
		y = scanner.nextInt();

		System.out.println("x + y = " + (x + y));

	}
}