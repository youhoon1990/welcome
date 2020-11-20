package d1120;

public class MainMouse {

	public static void main(String[] args) {
		mouse mouse = new mouse() {
			
		};
		
//		mouse.click();
//		mouse.drag();
//		mouse.rightClick();
		
		WheelMouse mouse2 = new WheelMouse() {
			
		};
//		
//		mouse2.click();
//		mouse2.drag();
//		mouse2.rightClick();
//		mouse2.scroll();
		
		GamingMouse gm = new GamingMouse() {
			
		};
		
		gm.click();
		gm.macro();
		gm.drag();
		gm.rightClick();
		

	}

}
