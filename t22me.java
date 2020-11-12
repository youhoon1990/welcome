package festival;

import java.util.Arrays;

public class t22me {

	public static int[] mergeArray(int[] A, int[] B) {
		A = new int[10];
		B = new int[10];

		for (int i = 0; i < 10; i++) {

			A[i] = (i + 1) * 2 - 1;
		}

		

		for (int i = 0; i < 10; i++) {
			B[i] = (i + 1) * 2;
		}

		
		int[] Merge = new int[A.length + B.length];
		for (int i = 0; i < A.length; i++) {
			Merge[i] = A[i];

		}
		for (int i = 0; i < 10; i++) {
			Merge[10 + i] = B[i];
		}
		
		
		for (int j = 19 ; j > 0; j--) {
			int maxIndex = 0;
			for(int i=0; i<=j; i++) {
				
				if(Merge[i]>Merge[maxIndex]) {
					maxIndex = i;
				}
				int temp = Merge[j];
				Merge[j] = Merge[maxIndex];
				Merge[maxIndex] = temp;
				
			}
			
		}
		System.out.println("Merge : "+Arrays.toString(Merge));
		return Merge;

	}

	public static void main(String[] args) {
		int[] A = { 1, 3, 5, 7, 9, 11, 13, 15, 17, 19 };
		int[] B = { 2, 4, 6, 8, 10, 12, 14, 16, 18, 20 };

		int[] Merge = mergeArray(A, B);
		

	}

}
