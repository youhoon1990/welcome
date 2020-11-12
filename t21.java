package festival;

import java.util.Scanner;

public class t21 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int[] array = new int[5];

		for (int i = 0; i < 5; i++) {
			System.out.print(i + 1 + "번째 수 입력 : ");
			array[i] = sc.nextInt();

		}
		for (int i = 0; i < array.length; i++) {

			System.out.print(array[i] + " ");
		}

		for (int j = array.length - 1; j > 0; j--) {
			int maxIndex = 0;
			for (int i = 0; i <= j; i++) {
				if (array[i] > array[maxIndex]) {
					maxIndex = i;

				}
			}
			int temp = array[j];

			array[j] = array[maxIndex];
			array[maxIndex] = temp;

			

		}

		System.out.println();
		for (int i = 0; i < array.length; i++) {

			System.out.print(array[i] + " ");
		}

	}

}
