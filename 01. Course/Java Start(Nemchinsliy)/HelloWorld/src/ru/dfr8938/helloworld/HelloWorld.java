package ru.dfr8938.helloworld;

public class HelloWorld {

	public static void main(String[] args) {
		
		String message = "Hello world!";
		System.out.println("String message = " + "\"" + message + "\"");
		
		int i = 42;
		System.out.println("int i = " + i);
		
		int j = 7;
		i = 6;
		
		int answer1 = i + j;
		int answer2 = i - j;
		int answer3 = i * j;
		int answer4 = i / j;
		
		System.out.println("i + j = " + answer1);
		System.out.println("i - j = " + answer2);
		System.out.println("i * j = " + answer3);
		System.out.println("i / j = " + answer4);
		
		String stringAnswer1 = message + " + " + answer1;
		String stringAnswer2 = message + " + " + answer2;
		String stringAnswer3 = message + " + " + answer3;
		String stringAnswer4 = message + " + " + answer4;
		
		System.out.println("stringAnswer1 = " + stringAnswer1);
		System.out.println("stringAnswer2 = " + stringAnswer2);
		System.out.println("stringAnswer3 = " + stringAnswer3);
		System.out.println("stringAnswer4 = " + stringAnswer4);
	}
}
