import java.util.Scanner;

public class SingleArrays {

	public static void main(String[] args) {
		
		Scanner in  = new Scanner(System.in);

		System.out.print("Enter the number of iterations: ");

		int countIteration = in.nextInt();

		// int[] intArray = {
		// 	0, 1, 2, 3, 4, 5, 6, 7, 8, 9
		// };

		int[] intArray = new int[countIteration];

		for (int i = 0; i < intArray.length; i++) {
			intArray[i] = i + 1;
			String str = i == intArray.length - 1 ? intArray[i] + "." : intArray[i] + ", ";
			System.out.print(str);
		}
	}
}