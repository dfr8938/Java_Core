public class MyClass {

	public static void main(String[] args) throws InterruptedException {

		System.out.println();
		System.out.print("... 0%");
		for(int i = 5; i < 101; i += 5) {

			Thread.sleep(1000); // Имитация процесса
			System.out.print("\r... " + i + "%");

		}

		System.out.println();
		System.out.println("Hello!!!");
	}
}