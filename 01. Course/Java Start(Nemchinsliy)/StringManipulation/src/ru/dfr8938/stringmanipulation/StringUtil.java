package ru.dfr8938.stringmanipulation;

public class StringUtil {

	public static void main(String[] args) {
		
		String source = "Hello World!";
		System.out.println("source = " + source);
		
		String[] arr = source.split(" ");
		System.out.println("length array: " + arr.length);
		int len = arr.length;
		for(int i = 0; i < len; i++) {
			/*
			 * String str = i == arr.length - 1 ? "arr[" + i + "]" + "\"" + arr[i] + "\"" + "." : "arr[" + i + "]" + "\"" + arr[i] + "\"" + ";";
			 * System.out.println(str);
			 */
			if(i == arr.length - 1) {
				System.out.println("arr[" + i + "]" + "\"" + arr[i] + "\"" + ".");
			} else {
				System.out.println("arr[" + i + "]" + "\"" + arr[i] + "\"" + ";");
			}
		}
		
		char[] arrChar = arr[0].toCharArray();
		System.out.println("length array: " + arrChar.length);
		len = arrChar.length;
		for(int i = 0; i < len; i++) {
			if(i == arrChar.length -1) {
				System.out.println(arrChar[i] + ".");
			} else {
				System.out.print(arrChar[i] + "-");
			}
		}
		
	}

}
