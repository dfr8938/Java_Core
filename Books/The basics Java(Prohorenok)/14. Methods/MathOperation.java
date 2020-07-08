public class MathOperation {

	private int a;
	private int b;

	public MathOperation() {
		System.out.println("This is constractor");
	}

	public MathOperation(int a, int b) {
		this.a = a;
		this.b = b;
	}

	public int add() {
		int c = this.a + this.b;
		return c;
	};

	public int subtract() {
		int c = this.a - this.b;
		return c;
	};

	public int multiply() {
		int c = this.a * this.b; 
		return c;
	}

	public int divide() {
		int c  = this.a / this.b;
		return c;
	}

	public void output() {
		System.out.println("a + b = " + add());
		System.out.println("a - b = " + subtract());
		System.out.println("a * b = " + multiply());
		System.out.println("a / b = " + divide());
	}

	public static void begin() {
		System.out.println("\n<------- Begin ------->\n");
	}

	public static void end() {
		System.out.println("\n<-------  End  ------->");
	}
}