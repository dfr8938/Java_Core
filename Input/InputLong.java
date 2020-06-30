// импортируем package java.util
// в котором и находится класс Scanner
import java.util.Scanner;

public class InputLong {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);

		System.out.print("Ввод числа типа long: ");
		long longInput;
		longInput = scanner.nextLong();
		System.out.println("Вы ввели: " + longInput);
	}
}