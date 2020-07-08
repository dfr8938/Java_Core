public class ForLoop {

	public static void main(String[] args) {

		System.out.println("\n<------- Begin: ------->\n");
		
		for(int i = 1; i < 101; i++) {
			if(i % 2 == 0 && i % 3 != 0 && i % 5 != 0) {
				System.out.println("multiple of 2 i = " + i);
			} else if(i % 3 == 0 && i % 2 != 0 && i % 5 != 0) {
				System.out.println("multiple of 3 i = " + i);
			} else if(i % 5 == 0 && i % 2 != 0 && i % 3 != 0) {
				System.out.println("multiple of 5 i = " + i);
			} else if(i % 2 == 0 && i % 3 == 0 && i % 5 == 0) {
				System.out.println("multiple of 2, 3 and 5 i = " + i);
			} else if(i % 2 == 0 && i % 3 == 0) {
				System.out.println("multiple of 2, 3 i = " + i);
			} else if(i % 2 == 0 && i % 5 == 0) {
				System.out.println("multiple of 2, 5 i = " + i);
			} else if(i % 3 == 0 && i % 5 == 0) {
				System.out.println("multiple of 3, 5 i = " + i);
			} else {
				System.out.println("i = " + i);
			}
		}

		System.out.println("\n<-------  End!  ------->\n\n");
		System.out.println("<------- Begin: ------->\n");

		for(int i = 100; i > 0; i--) {
			if(i % 2 == 0 && i % 3 != 0 && i % 5 != 0) {
				System.out.println("multiple of 2 i = " + i);
			} else if(i % 3 == 0 && i % 2 != 0 && i % 5 != 0) {
				System.out.println("multiple of 3 i = " + i);
			} else if(i % 5 == 0 && i % 2 != 0 && i % 3 != 0) {
				System.out.println("multiple of 5 i = " + i);
			} else if(i % 2 == 0 && i % 3 == 0 && i % 5 == 0) {
				System.out.println("multiple of 2, 3 and 5 i = " + i);
			} else if(i % 2 == 0 && i % 3 == 0) {
				System.out.println("multiple of 2, 3 i = " + i);
			} else if(i % 2 == 0 && i % 5 == 0) {
				System.out.println("multiple of 2, 5 i = " + i);
			} else if(i % 3 == 0 && i % 5 == 0) {
				System.out.println("multiple of 3, 5 i = " + i);
			} else {
				System.out.println("i = " + i);
			}
		}

		System.out.println("\n<-------  End!  ------->\n");
	}
}