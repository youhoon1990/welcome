package method;

import java.util.Scanner;

public class d1112_t5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("ù ��° ���� �Է� : ");
		int num1 = sc.nextInt();
		System.out.print("�� ��° ���� �Է� : ");
		int num2 = sc.nextInt();
		
		int result = getAbsoluteValue(num1, num2);
		System.out.println("���Ȯ�� : "+result);

	}
	public static int getAbsoluteValue(int a, int b) {
		if(a-b<0) {
			return (a-b)*-1;
		} else {
			return a-b;
		}
	}

}
