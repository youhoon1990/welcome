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
		System.out.printf("%s님 안녕하세요.\n", name);
		System.out.printf("[%s, %d살]\n", number, age);
		System.out.printf("%s님의 Java점수는 %d입니다.\n", name,  scoreJava);
		
		System.out.printf("%s님의 Web점수는 %d입니다.\n", name, scoreWeb);
		System.out.printf("%s님의 Android점수는 %d입니다.\n", name, scoreAndroid);
		
		
		
		
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
	
	//Getter메소드
	//이름을 돌려주는 메소드
	
	public String getName() {
		return name;
	}
	

}
