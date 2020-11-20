package animal;

import java.util.Scanner;

public class MainAnimal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

//		WildAnimal wa = new WildAnimal() {
//		};\
		WildAnimal animal = null;  //널로 초기화

//		Lion lion = new Lion() {
//		};
//		Eagle eagle = new Eagle()
//		{
//		};
//		Wolf wolf = new Wolf() {
//		};

		while (true) {
			System.out.println("---동물 사냥법---");
			System.out.println("[1]사자 [2]독수리 [3]늑대 [4]종료");
			int menu = sc.nextInt();
			
			if(menu==1){
				animal = new Lion();
				
			}else if(menu==2) {
				animal = new Eagle();
			}else if(menu==3) {
				animal = new Wolf();
			}else if(menu==4) {
				System.out.println("종료되었습니다.");
				break;
				
			}else {
				animal = new WildAnimal();
			}
			animal.hunt();
			

		}

	}

}
