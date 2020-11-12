package array;
// 메소드 이름이 같은데 기능이 다름 한 클래스 내에서 매개 변수의 개수나 타입이 다를 때 메소드 이름을 중복해서 사용하는것  
// 매개변수가 같으려면 변수타입이 달라야
public class Ex_11메소드오버로딩 {

	public static void main(String[] args) {
		int num1 = 10;
		int num2 = 5;
		int num3 = 3;
		System.out.println(add(num1, num2));
		System.out.println(add(num1, num2, num3));
		
		//num1~3 합해서 리턴하는 메소드

	}
	
	public static int add(int num1, int num2) {
		return num1+num2;
	}
	
	public static int add(int num1, int num2, int num3) {
		return num1+num2+num3;

}
}
