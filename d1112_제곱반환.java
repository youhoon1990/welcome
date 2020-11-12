package method;

public class d1112_제곱반환 {



	public static void main(String[] args) {
		
		int base = 3;
		int n = 3;
		int result = powerN(base, n);
		System.out.println("결과확인 " + result);
	}
	
	
	
	public static int powerN1(int base, int n) {
		int a= base;
		for(int i = 1; i<n; i++ ) {
			 base = a*base;
		}
		return base;
		
		
	}
	
	public static int powerN(int base, int n) {
		int result= 1;
		for(int i = 0; i<n; i++ ) {
			 result = result*base;
		}
		return result;
		
		
	}

}
