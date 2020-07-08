public class MultyArrays {

	public static void main(String[] args) {
		
		int[][] intArray = new int[3][3];

		System.out.println();

		for(int i = 0; i < intArray.length; i++) {
			for(int j = 0; j < intArray[i].length; j++) {
				intArray[i][j] = i + j;
				String str = j == 2 ? "|" + intArray[i][j] + "|\n" : "|" + intArray[i][j]; 
				System.out.print(str);
			}
		}
	}
}