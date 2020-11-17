package tutorial;

public class mainStuden {

	public static void main(String[] args) {
		
		Student student1 = new Student("나예호", "20190675", 21, 50, 89, 77);
		Student student2 = new Student("김운비", "20200541", 20, 81, 100, 95);
		

		
		student1.show();
		
		System.out.println("===========================================");
		student2.show();
		Student student3 = new Student("오주율", "20218655");
		student3.setAge(30);
		student3.setJava(50);
		student3.setWeb(60);
		student3.setAndroid(70);
		student3.show();
		
		student3.getName();
		
		System.out.println(student3.getName());
	}

}
