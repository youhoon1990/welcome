package array;

public class 피보나치 {

	public static int getFibo(int num) {
		if (num == 1) {
			return 1;
		} else if (num == 2) {
			return 1;
		} else {
			return getFibo(num - 2) + getFibo(num - 1);

		}
		
	}
	/* 피보나치 수열의 전 항(전값)+ 전전항(전전값)
	 * 예를 들어서 , num이 3이라면
	 * num이 2인 피보나치 수열의 값과 
	 * num이 1인 값을 더하면 된다.
	 * 예로 특정한 값num이라고 하면
	 * num1과 num2 의 값을 더하면 되겠네.
	 */

	public static void main(String[] args) {
		System.out.println(getFibo(1));
		System.out.println(getFibo(2));
		System.out.println(getFibo(3));
		System.out.println(getFibo(4));
		System.out.println(getFibo(5)); // 1 1 2 3 5 로 나와야 함

	}

}
