package array;

import java.util.Arrays;
import java.util.Random;


public class ·Î¶Ç {

	public static void main(String[] args) {
		int[] array = new int[6];
		Random ran = new Random();
		

		for (int i = 0; i < array.length; i++) {
			System.out.println(i);
			array[i] = ran.nextInt(10) + 1;
			System.out.println(Arrays.toString(array));
			for (int j = 0; j < i; j++) {
				
				if (array[j] == array[i]) {
					i--;
					break;
				}
				
				
			}
		}
		
		System.out.println(Arrays.toString(array));

	}

}
