
public class Monitor {

	public boolean power; // ���� on/off ����
	public int brightness; // ȭ�� ���

	// �߱� �����ϱ�
	public void brightSelect(int brightness) {
		this.brightness = brightness;

	}

	// �����ѱ�/����
	public void isPower( ) {
		power = !power;

	}
	
	//�������¿� ��� ���¸� ���
	public void info( ) {
		System.out.printf("���� ���� : %d,   ���� ���� ���´� %b\n", brightness, power);
		
	}

}
