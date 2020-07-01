import java.util.Scanner;

public class Switch {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);

		System.out.print("Введите целое число, в диапазоне от 1 до 10: ");
		int x = scanner.nextInt();

		switch(x) {
			case 0:
				System.out.println("Это число не входит в диапазон!");
				break;
			case 1:
				System.out.println("x = 1");
				break;
			case 2:
				System.out.println("x = 2");
				break;
			case 3:
				System.out.println("x = 3");
				break;
			case 4:
				System.out.println("x = 4");
				break;
			case 5:
				System.out.println("x = 5");
				break;
			case 6:
				System.out.println("x = 6");
				break;
			case 7:
				System.out.println("x = 7");
				break;
			case 8:
				System.out.println("x = 8");
				break;
			case 9:
				System.out.println("x = 9");
				break;
			default:
				System.out.println("x = 10");
		}

	}
}