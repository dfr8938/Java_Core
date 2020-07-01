// импортируем package java.util
// в котором и находится класс Scanner
import java.util.Scanner;

public class InputInt {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Ввод числа типа int: ");
		int intInput;
		intInput = scanner.nextInt();
		System.out.println("Вы ввели: " + intInput);

	}
}