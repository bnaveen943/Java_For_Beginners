package basicPrograms;

public class Progm14 {
	public static void main(String[] args) {

		m1();
		m2();
	}

	public static void m1() {
		int[][][] three_array = { { { 1, 3, 5 }, { 2, 4, 6 } }, { { 4, 6, 8 }, { 9, 7, 5 } },
				{ { 2, 4, 6 }, { 1, 5, 7 } } };

		for (int i = 0; i < three_array.length; i++) {
			for (int j = 0; j < three_array.length; j++) {
				try {
					for (int k = 0; k < three_array.length; k++) {
						System.out.print(three_array[i][j][k] + " ");
					}

				} catch (Exception e) {

				}
				System.out.println();
			}

		}

	}

	public static void m2() {
		int[][][] arr = { { { 1, 2, 5 }, { 3, 4, 7 } }, { { 5, 6, 1 }, { 7, 8, 9 } }, { { 1, 2, 4 }, { 5, 6, 7 } } };

		try {
			for (int i = 0; i < 3; i++) {
				for (int j = 0; j < 3; j++) {
					for (int z = 0; z < 3; z++)
						System.out.println("arr[" + i + "][" + j + "][" + z + "] = " + arr[i][j][z]);
					System.out.println();
				}
				System.out.println();
			}

		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}

}
