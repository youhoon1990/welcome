package animal;

public class Lion extends WildAnimal {
	
	
	//public String name ="사자";
	
	@Override
	public void hunt() {
		super.name = "사자";
		System.out.println("단독사냥하기");
	}

}
