
public class PiggyBank {
	
	public int money = 1000;
	
	public void showmoney() {
		System.out.println("현재 잔액은 : " + money + "원");
		
	}
	public void deposit(int input) {
		money = money+input;
	}
	public void withDraw(int input) {
		money = money-input;
	}

}
