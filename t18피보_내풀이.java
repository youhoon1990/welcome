package festival3;

public class t18피보_내풀이 {

	public static void main(String[] args) {
		System.out.println(jumpCase(3));

	}

//	public static int jumpCase(int input) {
//		int last1, last2, result = 0;
//		if (input <= 1) {
//			return 1;
//		}
//		last1 = 1;
//		last2 = 1;
//
//		for (int i = 1; i < input ; i++) {
//			result = last1 + last2;
//			last1 = last2;
//			last2 = result;
//		}
//		return result;
//	}
	public static int jumpCase(int input) {
		int num1, num2, result =0;
		if(input <=1) {
			return 1;
		}
		num1 =1;
		num2 =1;
		for(int i=1; i<input; i++ ) {
			result = num1+num2;
			num1 = num2;
			num2 = result;
		}
		return result;
	}
	

}
