package d1119;

import java.util.ArrayList;
import java.util.Scanner;

public class MusicPlayer {

	public static void main(String[] args) {
		// 2�ð�¥�� ����

		Scanner sc = new Scanner(System.in);
		// int num;

		
		
		ArrayList <String> list = new ArrayList<>();
		list.add("Maria");
		list.add("HowyouLikeThat");
		list.add("��");
		list.add("��¦������");
		
		
		
		
		while (true) {

			System.out.print("[1]�뷡��ȸ, [2]�뷡�߰� [3]�뷡���� [4]���� >>");
			int menu = sc.nextInt();

			if (menu == 1) {
				playList(list);
			} else if (menu == 2) {
				playList(list);
				System.out.print("[1]������ ��ġ�� �߰� [2]���ϴ� ��ġ�� �߰� >> ");
				int input = sc.nextInt();
				if(input==1) {
					System.out.print("�߰��� �뷡 �Է� >> ");
					String song = sc.next();
					list.add(song);
					System.out.println("�߰��� �Ϸ�Ǿ����ϴ�. ");
				}else if(input==2) {
					
				
					System.out.print("�߰��� �뷡 �Է� ");
					String a = sc.next();
					
					System.out.print("�߰��� ��ġ �Է� >> ");
					int num = sc.nextInt();
					list.add(num-1, a);
					System.out.println("�߰��� �Ϸ�Ǿ����ϴ�. ");
				}
				

			} else if (menu == 3) {
				// 3�� �뷡����
				playList(list);
				System.out.print("[1]���� ���� [2]��ü���� >> ");
				int input = sc.nextInt();
				if(input ==1) {
					System.out.print("������ �뷡 ���� >> ");
					int del = sc.nextInt();
					list.remove(del-1);
					System.out.println("�뷡�� ���� �Ǿ����ϴ�.");
				}else if(input==2) {
					list.clear();
					System.out.println("��ü ����Ʈ�� ���� �Ǿ����ϴ�. ");
				}
				
			} else if (menu == 4) {
				System.out.println("���α׷��� �����մϴ�.");
				break;
			} else {
				System.out.println("�߸� �Է��ϼ̽��ϴ�.");
			}

//			if(num == 4) {
//				
//				break;
//			} else if(num ==1 || num ==2 || num ==3)  {
//				
//			}else {
//				
//			}
//			

		}

	}

	public static void playList(ArrayList<String> list) {
		System.out.println("========���� ��� ���======");
		if(list.size() == 0) {
			System.out.println("�������� �����ϴ�.");
		}else {
			for(int i=0; i<list.size(); i++) {
				System.out.println(i+1+". "+list.get(i));
				
			}				
		}
		

		System.out.println("==========================");
	}

}
