public class Numbers {

	public static void main(String[] args) {
		
		System.out.println("\nType       Value");
		System.out.println("\nbyte\n\t    min:  " + Byte.MIN_VALUE + "\n\t    max:   " + Byte.MAX_VALUE + "\n\t  bytes:   " + Byte.BYTES);
		System.out.println("\nshort\n\t    min:  " + Short.MIN_VALUE + "\n\t    max:   " + Short.MAX_VALUE + "\n\t  bytes:   " + Short.BYTES);
		System.out.println("\nint\n\t    min:  " + Integer.MIN_VALUE + "\n\t    max:   " + Integer.MAX_VALUE + "\n\t  bytes:   " + Integer.BYTES);
		System.out.println("\nlong\n\t    min:  " + Long.MIN_VALUE + "\n\t    max:   " + Long.MAX_VALUE + "\n\t  bytes:   " + Long.BYTES);


		System.out.println("\nfloat\n\t    min:   " + Float.MIN_VALUE + "\n\t    max:   " + Float.MAX_VALUE + "\n\t  bytes:   " + Float.BYTES);
		System.out.println("\ndouble\n\t    min:   " + Double.MIN_VALUE + "\n\t    max:   " + Double.MAX_VALUE + "\n\t  bytes:   " + Double.BYTES);

		int a = 10;
		int b = 2;

		final double PI = 3.14;

		int c = b - a;

		// abs() - возвращает абсолютное значение
		System.out.println(Math.abs(c));

		// pow() - возведение в степень
		System.out.println(Math.pow(a, b));

		// sqrt() - возвращает квадратный корень числа
		System.out.println(Math.sqrt(Math.pow(a, b)));

		// max - максимальное значение
		System.out.println(Math.max(a, b));

		// min - минимальное значение
		System.out.println(Math.min(a, b));

		// ceil - округление до ближайшего большего значения
		System.out.println(Math.ceil(PI));

		// floor - округление до ближайшего меньшего значения
		System.out.println(Math.floor(PI));

		// round - округляет в меньшую сторону, если число после запятой < 5
		//         и в большую, если число >= 5
		System.out.println(Math.round(PI));

		// parseByte() - преобразование строки в число типа byte
		System.out.println(Byte.parseByte("111", 10));

		// parseShort() - преобразование строки в число типа short
		System.out.println(Short.parseShort("111", 2));

		// parseInt() - преобразование строки в число типа int
		System.out.println(Integer.parseInt("111", 8));

		// parseLong() - преобразование строки в число типа long
		System.out.println(Long.parseLong("111", 16));

		byte bt = 1;
		short sh = 10;
		int integ = 120;
		long l = 56_000L;

		float fl = 12.36F;
		double dob = 15.693; 

		// toString() - конвертирует число в строку
		System.out.println(Byte.toString(bt));
		System.out.println(Short.toString(sh));
		System.out.println(Integer.toString(integ));
		System.out.println(Long.toString(l));

		System.out.println(Float.toString(fl));
		System.out.println(Double.toString(dob));

		// random() - генерация случайных чисел
		System.out.println(Math.floor(Math.random() * 10));

	}	

}