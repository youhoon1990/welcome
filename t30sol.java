package festival3;

public class t30sol {

	public static void main(String[] args) {

		System.out.println(expressions(10));
		
//		int result = 0;
//		int count = 0;
//		int sum = 0;
//		
//		for(int j = 1; j<=15; j++) {
//			sum=0;
//			for(int i =j; i<=15; i++) {
//				sum = sum+i;
//				
//				if(15==sum) {
//					System.out.println(i);;
//					count++;
//				}
//				
//			}
//		}

		

		
	


	}
	
	
	
	private static int expressions(int i) {
		
		int result = 0;
		
		for(int j=1; j<=i; j++) {
			
			int num = j;
			int sum = 0;
			
			
			while(num<=i) {
				sum = sum+num;
				num++;
				
				if(sum == i) {
					result++;
					break;
				}
			}
		}

		

		
		return result;
	}
}

