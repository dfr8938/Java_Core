package ru.dfr8938.helloworld;

public class HelloWorld {

	public static void main(String[] args) {
		
		String message = "Hello world!";
		System.out.println("String message = " + "\"" + message + "\"" + "\n");
		
		int i = 42;
		System.out.println("int i = " + i + "\n");
		
		int j = 7;
		i = 6;
		
		int answer1 = i + j;
		int answer2 = i - j;
		int answer3 = i * j;
		int answer4 = i / j;
		
		System.out.println("i + j = " + answer1);
		System.out.println("i - j = " + answer2);
		System.out.println("i * j = " + answer3);
		System.out.println("i / j = " + answer4 + "\n");
		
		String stringAnswer1 = message + " + " + answer1;
		String stringAnswer2 = message + " + " + answer2;
		String stringAnswer3 = message + " + " + answer3;
		String stringAnswer4 = message + " + " + answer4;
		
		System.out.println("stringAnswer1 = " + stringAnswer1);
		System.out.println("stringAnswer2 = " + stringAnswer2);
		System.out.println("stringAnswer3 = " + stringAnswer3);
		System.out.println("stringAnswer4 = " + stringAnswer4 + "\n");
		
		float i2 = 6;
		float j2 = 7;
		
		float answer_1 = i2 + j2;
		float answer_2 = i2 - j2;
		float answer_3 = i2 * j2;
		float answer_4 = i2 / j2;
		
		System.out.println("i + j = " + answer_1);
		System.out.println("i - j = " + answer_2);
		System.out.println("i * j = " + answer_3);
		System.out.printf("%s / %s = %.2f", "i", "j", answer_4);
	}
}
