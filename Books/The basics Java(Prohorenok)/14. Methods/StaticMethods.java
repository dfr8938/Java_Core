import java.util.Scanner;

public class StaticMethods {

	public static void main(String[] args) {
			
		Scanner in = new Scanner(System.in);

		System.out.print("\nValue 'a': ");
		int a = in.nextInt();
		System.out.print("Value 'b': ");
		int b = in.nextInt();

		MathOperation operation = new MathOperation(a, b);

		MathOperation.begin();
		
		operation.output();

		MathOperation.end();

	}
}