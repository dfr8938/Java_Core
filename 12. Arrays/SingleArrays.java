import java.util.Scanner;

public class SingleArrays {

	public static void main(String[] args) {

		// int[] intArray = {
		// 	0, 1, 2, 3, 4, 5, 6, 7, 8, 9
		// };
		
		Scanner in  = new Scanner(System.in);

		System.out.print("\nEnter the number of iterations: ");

		int countIteration = in.nextInt();

		int[] intArray = new int[countIteration];

		outputArray(intArray);

		System.out.println("\n\nmin value = " + min(intArray));
		System.out.println("max value = " + max(intArray));

		reverse(intArray);

		outputArray(intArray);
		
	}

	public static void outputArray(int[] arr) {

		System.out.print("\narray = [");

		for (int i = 0; i < arr.length; i++) {
			arr[i] = i + 1;
			String str = i == arr.length - 1 ? arr[i] + "]" : arr[i] + ", ";
			System.out.print(str);
		}
	}

	public static void reverse(int[] arr) {

		System.out.print("\narray = [");

		for(int i = arr.length - 1; i >= 0; i--) {

			arr[i] = arr[i];
			String str = i == 0 ? arr[i] + "]\n" : arr[i] + ", ";
			System.out.print(str);
		}
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

	public static int max(int[] arr) {

		int x = arr[0];

		for(int i = 0; i < arr.length; i++) {
			if(x < arr[i]) {
				x = arr[i];
			}
		} 

		return x;
	}

}