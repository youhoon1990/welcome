package array;

import java.util.Random;
import java.util.Scanner;

public class ���ù迭 {

	public static void main(String[] args) {
		
		
		int[] array = { 44, 2, 98, 5, 17 };
		
		for(int j =4; j>0; j-- ) {
			
			int maxIndex = 0;
			for (int i = 0; i <=j; i++) {
				if (array[i] > array[maxIndex]) {
					maxIndex = i;
				}
			}
			
			int temp = array[j]; // ���� ������ ����
			array[j] = array[maxIndex];
			array[maxIndex] = temp;
		}


		for(int i= 0; i<array.length; i++) {
			
			System.out.print(array[i]+" ");
		}

	}

}

//if (arr[i] > max) {
//	max = arr[i];
//}
