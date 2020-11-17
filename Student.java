package tutorial;

public class Student {
	private String name;
	private String number;
	private int age;
	private int scoreJava;
	private int scoreWeb;
	private int scoreAndroid;
	
	public Student(String name, String number, int age, int scoreJava, int scoreWeb, int scoreAndroid ) {
		this.name = name;
		this.number = number;
		this.age = age;
		this.scoreJava = scoreJava;
		this.scoreWeb = scoreWeb;
		this.scoreAndroid = scoreAndroid;
		
	}
	
	public Student(String name, String number) {
		this.name = name;
		this.number= number;
	
	}
	
	public void show() {
		System.out.printf("%s�� �ȳ��ϼ���.\n", name);
		System.out.printf("[%s, %d��]\n", number, age);
		System.out.printf("%s���� Java������ %d�Դϴ�.\n", name,  scoreJava);
		
		System.out.printf("%s���� Web������ %d�Դϴ�.\n", name, scoreWeb);
		System.out.printf("%s���� Android������ %d�Դϴ�.\n", name, scoreAndroid);
		
		
		
		
	}
	
	public void setAge(int age) {
		
		this.age = age;
		
	}
	
	public void setJava(int scoreJava) {
		
		this.scoreJava = scoreJava;
		
	}
	
	
	public void setWeb(int scoreWeb) {
		
		this.scoreWeb = scoreWeb;
		
	}
	
	public void setAndroid(int scoreAndroid) {
		
		this.scoreAndroid = scoreAndroid;
		
	}
	
	//Getter�޼ҵ�
	//�̸��� �����ִ� �޼ҵ�
	
	public String getName() {
		return name;
	}
	

}
