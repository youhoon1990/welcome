package method;

public class d1112_t6메소드응용 {

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
		// 완전수인지 구별
		if (num == getSum(num)) {
			return true;
		}

		return false;
	}

	public static boolean isPrimeNum(int num) {
		// 소수 라면 true 아니면 false
		// 자기 자신을 죄외한 약수가 1밖에 없는 수
		// 즉 자기자신 제외 약수총합이 1인 수  
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
