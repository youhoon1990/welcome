package festival3;

import java.util.Scanner;

public class t15 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("첫자리0을 제외한 숫자를 입력해주세요 >> ");
		String input = sc.next();

		String[] array = input.split("");

		System.out.println(array.length);
//		069 >6
//		1 >2
//		235 >5
//		4>4
//		7>3
//		8>7
		int sum = 0;
		for (int i = 0; i < array.length; i++) {
			switch (array[i]) {
			case "0":
				sum = sum+6;
				break;
			case "1":
				sum = sum + 2;
				break;
			case "2":
				sum = sum+5;
				break;
			case "3":
				sum = sum+5;
				break;
			case "4":
				sum = sum+4;
				break;
			case "5":
				sum = sum+5;
				break;
			case "6":
				sum = sum+6;
				break;
			case "7":
				sum = sum+3;
				break;
			case "8":
				sum = sum+7;
				break;
			case "9":
				sum = sum+6;
				break;

			}
		}
		System.out.println("대시('-')의 총 합" +sum);

	}

}
