import java.util.Scanner;

public class IfElse {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);

		System.out.print("Введите целове число: ");
		int i = scanner.nextInt();

		// if(i % 2 == 0) {
		// 	System.out.println("Число " + i + " четное =)");
		// } else {
		// 	System.out.println("Число " + i + " нечетное =(");
		// }

		String s = i % 2 == 0 ? "Число " + i + " четное" : "Число " + i + " нечетное";
		
		System.out.println(s);
	}
}