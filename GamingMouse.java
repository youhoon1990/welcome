package d1120;

public class GamingMouse extends mouse{
	public void macro() {
		System.out.println("매크로 실행");
	}
	@Override
	public void click() {
		System.out.println("좌플릭 10번하기");
	}

}
