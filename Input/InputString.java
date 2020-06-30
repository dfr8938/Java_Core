// импортируем package java.util
// в котором и находится класс Scanner
import java.util.Scanner;

public class InputString {

	public static void main(String[] atgs) {

		Scanner scanner = new Scanner(System.in);

		System.out.print("Ввод строки: ");
		String stringInput;
		stringInput = scanner.nextLine();
		System.out.println("Вы ввели: " + stringInput);

	}
}