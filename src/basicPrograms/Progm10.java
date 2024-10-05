package basicPrograms;



public class Progm10 {
	public static void main(String[] args) {
		/*
		 * 2d array 
		 */
		int[][] cat= new int[][]{{2,4,6}, {8,1,2}, {4,7,9}};
		
		for (int i = 0; i < cat.length; i++) {
			
			for (int j = 0; j < cat.length; j++) {
				System.out.print(cat[i][j] + " ");
				
				
			}
			System.out.println();
		}
	}

}
