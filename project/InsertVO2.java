package project;

public class InsertVO2 {

	

	//�� 4��¥���� ȸ�������Ҷ� ��

	public InsertVO2(String id, String pw, String name, int tel) {
		
		this.id = id;
		this.pw = pw;
		this.name = name;
		this.tel = tel;
	}
	//�Ʒ��� �α����Ҷ����� ������
	public InsertVO2(String id, String pw) {
		this.id = id;
		this.pw = pw;
	};
	private String id, pw, name;
	private int tel;
	public String getId() {
		return id;
	}
	public String getPw() {
		return pw;
	}
	public String getName() {
		return name;
	}
	public int getAge() {
		return tel;
	}
	public void setId(String id) {
		this.id = id;
	}
	public void setPw(String pw) {
		this.pw = pw;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setAge(int age) {
		this.tel = tel;
	}
	
	//�����ڶ� ���ͼ��� �޼ҵ� ������
}
