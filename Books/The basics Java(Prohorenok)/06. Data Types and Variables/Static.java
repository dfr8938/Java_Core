public class Static {

	// если надо получить доступ к переменой из разных методов 
	// ставим перед переменной ключевое слово static

	static int i = 10;

	// тоже самое и с константами

	static final String MAIL = "d.fr8938@gmail.com";

	public static void main(String[] args) {

		System.out.println();
		System.out.println("static int i = " + Static.i + ";");
		System.out.println("static final String MAIL = '" + Static.MAIL + "';");

	}
}