package animal;

import java.util.Scanner;

public class MainAnimal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

//		WildAnimal wa = new WildAnimal() {
//		};\
		WildAnimal animal = null;  //�η� �ʱ�ȭ

//		Lion lion = new Lion() {
//		};
//		Eagle eagle = new Eagle()
//		{
//		};
//		Wolf wolf = new Wolf() {
//		};

		while (true) {
			System.out.println("---���� ��ɹ�---");
			System.out.println("[1]���� [2]������ [3]���� [4]����");
			int menu = sc.nextInt();
			
			if(menu==1){
				animal = new Lion();
				
			}else if(menu==2) {
				animal = new Eagle();
			}else if(menu==3) {
				animal = new Wolf();
			}else if(menu==4) {
				System.out.println("����Ǿ����ϴ�.");
				break;
				
			}else {
				animal = new WildAnimal();
			}
			animal.hunt();
			

		}

	}

}
