public class Output {

	public static void main(String[] args) {

		/*
			System.out - вывод сообщений в консоль
			System.err - вывод ошибок в консоль

			Оба объекта возвращают экземпляр класса PrintStream
			у которого доступны методы:
			
			print, println, printf 
		*/

		/* print
			- отправляет данные в стандартный поток вывода
		    - принимает все типы данных
		    - не делает перенос строки, после вывода всего содержимого
		*/

		System.out.print("Output\n");
		System.err.print("Error\n");

		/* println
			- отправляет данные в стандартный поток вывода
		    - принимает все типы данных
		    - делает перенос строки, после вывода всего содержимого
		*/

		System.out.println("Output");
		System.err.println("Error");

		/* printf
			- предназначен для форматированного вывода данных
		*/

		System.out.printf("%d\n", 10);
		System.out.printf("%f\n", 10.2569896);
		System.out.printf("%s", "Hello, world!");
	}
}