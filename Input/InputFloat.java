// импортируем package java.util
// в котором и находится класс Scanner
import java.util.Scanner;

public class InputFloat {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);

		System.out.print("Ввод числа типа float: ");
		float floatInput;
		floatInput = scanner.nextFloat();
		System.out.println("Вы ввели: " + floatInput);
		
	}
}