package array;
// �޼ҵ� �̸��� ������ ����� �ٸ� �� Ŭ���� ������ �Ű� ������ ������ Ÿ���� �ٸ� �� �޼ҵ� �̸��� �ߺ��ؼ� ����ϴ°�  
// �Ű������� �������� ����Ÿ���� �޶��
public class Ex_11�޼ҵ�����ε� {

	public static void main(String[] args) {
		int num1 = 10;
		int num2 = 5;
		int num3 = 3;
		System.out.println(add(num1, num2));
		System.out.println(add(num1, num2, num3));
		
		//num1~3 ���ؼ� �����ϴ� �޼ҵ�

	}
	
	public static int add(int num1, int num2) {
		return num1+num2;
	}
	
	public static int add(int num1, int num2, int num3) {
		return num1+num2+num3;

}
}
