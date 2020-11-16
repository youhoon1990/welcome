package festival3;

public class t28ÀÌÁø¼ö {

	public static void main(String[] args) {
		String str = "01001101";

		String[] temp = str.split("");

		int[] array = new int[temp.length];

		for (int i = 0; i < temp.length; i++) {
			array[i] = Integer.parseInt(temp[i]);

			System.out.print(array[i] + " ");
		}
		
		int sum = 0;
		int num = 128;
		for(int i = 0; i<array.length; i++) {
			
			sum = sum+ array[i]*num;
			num = num/2;
			
						
		}
		
		System.out.println(sum);
		

	}
}
