package method;

public class d1112_��ū����ȯ {

	private static int largerNumbers(int a, int b) {
		int result = 0;
		if(a>b) {
			return a;
		}
		else if(a<b) {
			return b;
		}
		else  {
			return 0;
		}
		

		

	}



	public static void main(String[] args) {
		
		int num1 = 10;
		int num2 = 24;
		int result = largerNumbers(num1, num2);
		System.out.println("ū�� Ȯ�� : " + result);
	}

}
