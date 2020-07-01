public class ForEachLoop {

	public static void main(String[] args) {
		
		int[] arr = {
			1, 2, 3, 4, 5, 6, 7, 8, 8, 10
		};

		for(int s:arr) {
			String str = s == 10 ? s + "." : s + ", ";
			System.out.print(str);
		}
	}
}