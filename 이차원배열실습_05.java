package array;

import java.util.Arrays;

public class 이차원배열실습_05 {

	public static void main(String[] args) {
		int[][] array = new int[5][5];

		int cnt = 21;
		int row = 0;
		int col = 0;

		for (int j = 0; j < 5; j++) {
			for (int i = 0; i < 5; i++) {
				array[j][i] = cnt++;

			}

		}

		System.out.println();

		System.out.println();
		for (int i = 4; i >=0; i--) {
			for (int j = 4; j >= 0; j--) {
				System.out.print(array[j][i] + "\t");
			}
			System.out.println();
		}

		System.out.println();
		for (int j = 0; j < array.length; j++) {
			for (int i = 0; i < array[j].length; i++) {
				System.out.print(array[4-i][4-j] + "\t");
			}
			System.out.println();

		}
	}

}
