package festival3;

public class 제자리_피보 {

	public static void main(String[] args) {
		System.out.println(dynamicFibonacci(7));
		
		
	}

	public static int dynamicFibonacci(int n) {
        // 동적프로그래밍 
        int last1, last2, result = 0;
        
        if(n <= 1)
            return 1;
        
        last1 = 1;
        last2 = 1;
        
        for(int i=1; i < n; i++) {
            result = last1 + last2;
            last1 = last2;
            last2 = result;
        }
        
        return result;
    }

}
