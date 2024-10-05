package basicPrograms;

public class Program13 {
	public static void main(String[] args) {

		/*
		 * int intArray[] = {1,2,4,6}; int cloneArray[] = intArray.clone();
		 * System.out.println(intArray==cloneArray); for (int i : cloneArray) {
		 * System.out.print(i+ " ");
		 * 
		 * }
		 */
		/*
		 * int intArray[][] =new int[][] {{2,4,6},{1,3,5}}; int
		 * cloneArray[][]=intArray.clone(); System.out.println(intArray==cloneArray);
		 * System.out.println(intArray[0] == cloneArray[0]);
		 * 
		 * String[][] x =new String[10][12];
		 */

		//
		int[][] arr = new int[][] { { 1, 2 }, { 4, 6 } };
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				for (int j2 = 0; j2 < arr.length; j2++) {

				}
				System.out.println("arr[" + i + "][" + j + "]= " + arr[i][j]);
			}
		}
	}

}
