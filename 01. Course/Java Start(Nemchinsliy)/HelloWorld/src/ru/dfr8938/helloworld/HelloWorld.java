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
	}
}
