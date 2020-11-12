package method;

import java.util.Scanner;

public class d1112_t5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("첫 번째 정수 입력 : ");
		int num1 = sc.nextInt();
		System.out.print("두 번째 정수 입력 : ");
		int num2 = sc.nextInt();
		
		int result = getAbsoluteValue(num1, num2);
		System.out.println("결과확인 : "+result);

	}
	public static int getAbsoluteValue(int a, int b) {
		if(a-b<0) {
			return (a-b)*-1;
		} else {
			return a-b;
		}
	}

}
