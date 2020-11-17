package tutorial;

public class mainPerson {

	public static void main(String[] args) {
		Person person1 = new Person();
		person1.setName("류훈희");
		person1.setAge(31);
		
		Person person2 = new Person("김영희", 27);
		
		System.out.println("학생이름 : "+person1.getAge()+", 나이 : "+person1.getName());
		System.out.println("학생이름 : "+person2.getAge()+", 나이 : "+person2.getName());
		
		

	}

}
