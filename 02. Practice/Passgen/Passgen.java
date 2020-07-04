import java.util.Scanner;
import java.util.Random;

public class Passgen {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);

		char[] simbol = {

			'a', 'b', 'c', 'd', 'f', 'g', 'h', 'i', 'j', 'k',
			'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u',
			'v', 'w', 'x', 'y', 'z',

			'A', 'B', 'C', 'D', 'F', 'G', 'H', 'I', 'J', 'K',
			'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U',
			'V', 'W', 'X', 'Y', 'Z',

			'0', '1', '2', '3', '4', '5', '6', '7', '8', '9',

			'@', '#', '$', '%', '^', '&', '*', '?', ':', ';',
			'-', '_', '+', '/', '='

		};

		Random r = new Random();

		System.out.print("(max value: 74) weight pass: ");

		int inNum = in.nextInt();
		int lenArr = simbol.length - 1;
	
		for(int i = 1; i <= inNum; i++) {

			System.out.print(simbol[Math.abs(r.nextInt(lenArr))]);
		}

	}

}