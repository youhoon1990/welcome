
public class Monitor {

	public boolean power; // 전원 on/off 여부
	public int brightness; // 화면 밝기

	// 발기 조절하기
	public void brightSelect(int brightness) {
		this.brightness = brightness;

	}

	// 전원켜기/끄기
	public void isPower( ) {
		power = !power;

	}
	
	//전원상태와 밝기 상태를 출력
	public void info( ) {
		System.out.printf("현재 밝기는 : %d,   현재 전원 상태는 %b\n", brightness, power);
		
	}

}
