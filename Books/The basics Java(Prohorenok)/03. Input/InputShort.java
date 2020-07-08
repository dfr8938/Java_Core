// импортируем package java.util
// в котором и находится класс Scanner
import java.util.Scanner;

public class InputShort {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);

		System.out.print("Ввод числа типа short: ");
		short shortInput;
		shortInput = scanner.nextShort();
		System.out.println("Вы ввели: " + shortInput);
	}
}