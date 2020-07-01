public class MathOperators {

	static int x = 10, y = 5;
	static double zeroDouble = 0.0;
	static int zeroInt = 0;

	public static void main(String[] args) {
		
		// +

		System.out.println("x + y = " + (int)(x + y));

		// -

		System.out.println("x - y = " + (int)(x - y));

		// *

		System.out.println("x * y = " + (double)(x * y));

		// /

		System.out.println("x / y = " + (double)(x / y));

		System.out.println("float(double) / 0 = " + 10.0 / zeroInt);
		System.out.println("-(float(double)) / 0 = " + -10.0 / zeroInt);
		System.out.println("0.0 / 0 = " + zeroDouble / zeroInt);
		System.out.println("int / 0" + 10 / zeroInt);
	}
}