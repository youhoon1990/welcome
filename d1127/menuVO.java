package d1127;

public class menuVO {
	String menu;
	int price, key;
	
	
	public menuVO(String menu, int price , int key){
		this.menu = menu;
		this.price = price;
		this.key = key;
	}


	public String getMenu() {
		return menu;
	}


	public int getPrice() {
		return price;
	}


	public int getKey() {
		return key;
	}


	public void setMenu(String menu) {
		this.menu = menu;
	}


	public void setPrice(int price) {
		this.price = price;
	}


	public void setKey(int key) {
		this.key = key;
	};

}
