package model;

public class InsertVO {

	

	//�� 4��¥���� ȸ�������Ҷ� ��

	public InsertVO(String id, String pw, String name, int age) {
		
		this.id = id;
		this.pw = pw;
		this.name = name;
		this.age = age;
		
	}
	//�Ʒ��� �α����Ҷ����� ������
	public InsertVO(String id, String pw) {
		this.id = id;
		this.pw = pw;
	};
	private String id, pw, name;
	private int age;
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
		return age;
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
		this.age = age;
	}
	
	//�����ڶ� ���ͼ��� �޼ҵ� ������
}
