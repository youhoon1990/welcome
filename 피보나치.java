package array;

public class �Ǻ���ġ {

	public static int getFibo(int num) {
		if (num == 1) {
			return 1;
		} else if (num == 2) {
			return 1;
		} else {
			return getFibo(num - 2) + getFibo(num - 1);

		}
		
	}
	/* �Ǻ���ġ ������ �� ��(����)+ ������(������)
	 * ���� �� , num�� 3�̶��
	 * num�� 2�� �Ǻ���ġ ������ ���� 
	 * num�� 1�� ���� ���ϸ� �ȴ�.
	 * ���� Ư���� ��num�̶�� �ϸ�
	 * num1�� num2 �� ���� ���ϸ� �ǰڳ�.
	 */

	public static void main(String[] args) {
		System.out.println(getFibo(1));
		System.out.println(getFibo(2));
		System.out.println(getFibo(3));
		System.out.println(getFibo(4));
		System.out.println(getFibo(5)); // 1 1 2 3 5 �� ���;� ��

	}

}
