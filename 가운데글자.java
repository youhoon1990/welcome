package festival3;

public class 가운데글자 {

	public static void main(String[] args) {
		System.out.println(getMiddle("powerrr"));

	}
	
	public static String getMiddle(String str) {
		int index = 0;
		String[] array = str.split("");
		if(array.length%2 ==1) {
			index = (array.length-1)/2;
			return array[index];
		}else {
			index = array.length/2;
			return array[index-1]+ array[index];
		}
	}


}
