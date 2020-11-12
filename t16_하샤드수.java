package festival3;

import java.util.Scanner;

//11분 했음
public class t16_하샤드수 {

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
//		Scanner sc = new Scanner(System.in);
//		int input = sc.nextInt();
		
		System.out.println(isHarshad(11));


	}

}
