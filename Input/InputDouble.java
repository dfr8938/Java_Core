// импортируем package java.util
// в котором и находится класс Scanner
import java.util.Scanner;

public class InputDouble {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);

		System.out.print("Ввод числа типа double: ");
		double doubleInput;
		doubleInput = scanner.nextDouble();
		System.out.println("Вы ввели: " + doubleInput);
	}
}