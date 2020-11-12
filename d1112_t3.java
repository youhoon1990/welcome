package method;

public class d1112_t3 {

	public static void main(String[] args) {

		int num1 = -1;
		int num2 = -5;
		int result = close10(num1, num2);
		System.out.println("10에 가까운 수 : " + result);
		System.out.println();
	}

	public static int close10(int num1, int num2) {
		int result1 = 10 < num1 ? num1 - 10 : 10 - num1;
		int result2 = 10 < num2 ? num2 - 10 : 10 - num2;

		if (result1 > result2) {
			return num2;
		} else if (result1 == result2) {
			return 0;
		} else {
			return num1;
		}

	}

}
