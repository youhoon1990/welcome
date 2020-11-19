package d1119;

import java.util.ArrayList;
import java.util.Scanner;

public class MusicPlayer {

	public static void main(String[] args) {
		// 2시간짜리 예제

		Scanner sc = new Scanner(System.in);
		// int num;

		
		
		ArrayList <String> list = new ArrayList<>();
		list.add("Maria");
		list.add("HowyouLikeThat");
		list.add("깡");
		list.add("살짝설랬어");
		
		
		
		
		while (true) {

			System.out.print("[1]노래조회, [2]노래추가 [3]노래삭제 [4]종료 >>");
			int menu = sc.nextInt();

			if (menu == 1) {
				playList(list);
			} else if (menu == 2) {
				playList(list);
				System.out.print("[1]마지막 위치에 추가 [2]원하는 위치에 추가 >> ");
				int input = sc.nextInt();
				if(input==1) {
					System.out.print("추가할 노래 입력 >> ");
					String song = sc.next();
					list.add(song);
					System.out.println("추가가 완료되었습니다. ");
				}else if(input==2) {
					
				
					System.out.print("추가할 노래 입력 ");
					String a = sc.next();
					
					System.out.print("추가할 위치 입력 >> ");
					int num = sc.nextInt();
					list.add(num-1, a);
					System.out.println("추가가 완료되었습니다. ");
				}
				

			} else if (menu == 3) {
				// 3번 노래삭제
				playList(list);
				System.out.print("[1]선택 삭제 [2]전체삭제 >> ");
				int input = sc.nextInt();
				if(input ==1) {
					System.out.print("삭제할 노래 선택 >> ");
					int del = sc.nextInt();
					list.remove(del-1);
					System.out.println("노래가 삭제 되었습니다.");
				}else if(input==2) {
					list.clear();
					System.out.println("전체 리스트가 삭제 되었습니다. ");
				}
				
			} else if (menu == 4) {
				System.out.println("프로그램을 종료합니다.");
				break;
			} else {
				System.out.println("잘못 입력하셨습니다.");
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
		System.out.println("========현재 재생 목록======");
		if(list.size() == 0) {
			System.out.println("재생목록이 없습니다.");
		}else {
			for(int i=0; i<list.size(); i++) {
				System.out.println(i+1+". "+list.get(i));
				
			}				
		}
		

		System.out.println("==========================");
	}

}
