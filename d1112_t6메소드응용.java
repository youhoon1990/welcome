package method;

public class d1112_t6�޼ҵ����� {

	public static boolean isDivisoer(int num1, int num2) {

		if (num1 % num2 == 0) {

			return true;
		}
		return false;
	}

	public static int getSum(int input) {
		int result = 0;
		for (int i = 1; i <= input / 2; i++) {

			if (input % i == 0) {
				result = result + i;
			}

		}

		return result;
	}

	public static boolean isPerfect(int num) {
		// ���������� ����
		if (num == getSum(num)) {
			return true;
		}

		return false;
	}

	public static boolean isPrimeNum(int num) {
		// �Ҽ� ��� true �ƴϸ� false
		// �ڱ� �ڽ��� �˿��� ����� 1�ۿ� ���� ��
		// �� �ڱ��ڽ� ���� ��������� 1�� ��  
		if (getSum(num) == 1) {

			return true;
		} else {
			return false;
		} 
		

		
	}

	public static void main(String[] args) {
		int num1 = 77;
		int num2 = 7;
		boolean divisor = isDivisoer(num1, num2);

		System.out.println(isPrimeNum(7)); // true
		System.out.println(isPrimeNum(6)); // false
		System.out.println(isPrimeNum(13)); // true

	}

}
