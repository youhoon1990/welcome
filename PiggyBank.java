
public class PiggyBank {
	
	public int money = 1000;
	
	public void showmoney() {
		System.out.println("���� �ܾ��� : " + money + "��");
		
	}
	public void deposit(int input) {
		money = money+input;
	}
	public void withDraw(int input) {
		money = money-input;
	}

}
