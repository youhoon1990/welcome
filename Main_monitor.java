
public class Main_monitor {

	public static void main(String[] args) {
		
		int a= 3;
		int[]array = new int[3];
		Monitor monitor = new Monitor();
		monitor.power = false;
		monitor.brightness = 50;
		
		
		monitor.brightSelect(150);
		
		monitor.isPower(); 
		monitor.isPower(); 
		
		monitor.info();
		System.out.println();
		
		
		
		Monitor monitor2 = new Monitor();
		monitor2.power = false;
		monitor2.brightness = 300;
		monitor2.info();


	}

}
