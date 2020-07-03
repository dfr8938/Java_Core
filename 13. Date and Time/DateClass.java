import java.util.Date;

public class DateClass {
	
	public static void main(String[] args) {
		
		// метка времени с 1 января 1970 года
		System.out.println(System.currentTimeMillis());

		// date - экземпляр класса Date
		Date date = new Date();
		// метка времени (1593759200437)
		System.out.println(date.getTime());
		// Fri Jul 03 09:53:20 EET 2020
		System.out.println(date.toString());

		date.setTime(222222555698L);
		
		System.out.println(date.toString());



	}
}