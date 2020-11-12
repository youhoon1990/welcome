package method;

public class d1112_10에서가까운수 {

	public static int cal(int a, int b, char c) {

		if (a < b) {
			int temp = 0;
			temp = a;
			a = b;
			b = temp;
		}

		if (c == '+') {
			return a + b;
		} else if (c == '-') {
			return a - b;
		} else if (c == '*') {
			return a * b;
		} else if (c == '/') {
			return a / b;
		} else {
			return 0;
		}

	}
	
	
	
	public static int cal2(int a, int b, char c) {

		if (a < b) {
			int temp = 0;
			temp = a;
			a = b;
			b = temp;
		}
		
		switch(c) {
		
		case '+' :
			return a+b;
		case '*' :
			return a*b;
		case '-' :
			return a-b;
		default  :
			return a/b;	
		}
	}

	public static void main(String[] args) {

		int num1 = 50;
		int num2 = 15;
		char op = '*';

		System.out.println(cal(num1, num2, op));
		System.out.println(cal2(num1, num2, op));

	}

}
