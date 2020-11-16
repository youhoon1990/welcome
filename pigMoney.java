
public class pigMoney {

	public static void main(String[] args) {
		PiggyBank PB = new PiggyBank();
		PB.showmoney();
		
		PB.deposit(1000);
		PB.showmoney();
		
		PB.withDraw(1500);
		PB.showmoney();

	}

}
