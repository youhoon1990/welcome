package tutorial;

public class mainPerson {

	public static void main(String[] args) {
		Person person1 = new Person();
		person1.setName("������");
		person1.setAge(31);
		
		Person person2 = new Person("�迵��", 27);
		
		System.out.println("�л��̸� : "+person1.getAge()+", ���� : "+person1.getName());
		System.out.println("�л��̸� : "+person2.getAge()+", ���� : "+person2.getName());
		
		

	}

}
