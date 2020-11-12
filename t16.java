package festival;

public class t16 {

	public static String isHarshad(int input) {
		
		String result = "asdf";
		int t = input/10;
		int o = input%10;
		int sum = t+o;
		
		if(input%sum == 0) {
			result = "true";
		} else {
			
			result = "false";
		}
		
		return result;
		
		 
		
	}

	public static void main(String[] args) {

		System.out.println(isHarshad(10));
		System.out.println(isHarshad(11));
		System.out.println(isHarshad(13));


	}

}