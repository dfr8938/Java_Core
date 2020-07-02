import java.util.Scanner;

public class SingleArrays {

	public static void main(String[] args) {
		
		Scanner in  = new Scanner(System.in);

		System.out.print("\nEnter the number of iterations: ");

		int countIteration = in.nextInt();

		// int[] intArray = {
		// 	0, 1, 2, 3, 4, 5, 6, 7, 8, 9
		// };

		System.out.print("\narray = [");

		int[] intArray = new int[countIteration];

		for (int i = 0; i < intArray.length; i++) {
			intArray[i] = i + 1;
			String str = i == intArray.length - 1 ? intArray[i] + "]" : intArray[i] + ", ";
			System.out.print(str);
		}

		System.out.println("\n\nmin value = " + min(intArray));
		System.out.println("max value = " + max(intArray));
		
	}

	public static int max(int[] arr) {

		int x = arr[0];

		for(int i = 0; i < arr.length; i++) {
			if(x < arr[i]) {
				x = arr[i];
			}
		} 

		return x;
	}

	public static int min(int[] arr) {

		int x = arr[0];

		for(int i = 0; i < arr.length; i++) {
			if(x > arr[i]) {
				x = arr[i];
			}
		} 

		return x;
	}
}