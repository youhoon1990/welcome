package festival3;

public class ���ڸ�_�Ǻ� {

	public static void main(String[] args) {
		System.out.println(dynamicFibonacci(7));
		
		
	}

	public static int dynamicFibonacci(int n) {
        // �������α׷��� 
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
