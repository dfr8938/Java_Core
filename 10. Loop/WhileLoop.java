public class WhileLoop {

	public static void main(String[] args) {
		
		String[] fruite = {
			"apple", "orange", "lime"
		};

		int i = 0;
		while(i < fruite.length){
			String f = i == fruite.length - 1 ? fruite[i] + "." : fruite[i] + ", ";
			System.out.print(f);
			i++;
		}
	}
}