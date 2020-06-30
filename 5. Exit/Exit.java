import java.util.Scanner;

public class Exit {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);

		int x = 0, y = 0;

		System.out.println("x = " + x + "\n" + "y = " + y);

		System.out.print("Введите x: ");
		x = scanner.nextInt();
		System.out.print("Введите y: ");
		y = scanner.nextInt();

		if(y <= 0) {
			
			System.out.print("На 0 делить нельзя!");
			System.exit(1);

		} else {

			System.out.print("x / y = " + (x / y));

		}
	}
}