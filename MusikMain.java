package d1119;

import java.util.ArrayList;
import java.util.Scanner;

import javazoom.jl.player.MP3Player;

public class MusikMain {

	public static void main(String[] args) {
		MP3Player mp3 = new MP3Player();
		//mp3.play("C:/Users/smhrd/Desktop/musicplayer/Maria.mp3");

		ArrayList<Music> list = new ArrayList<Music>();
		Music m1 = new Music("��", "��", "C:/Users/smhrd/Desktop/musicplayer/��.mp3");
		list.add(m1);
		
		list.add(new Music("��¦������", "��", "C:/Users/smhrd/Desktop/musicplayer/��¦������.mp3"));
		list.add(new Music("Howyoulikethat", "��", "C:/Users/smhrd/Desktop/musicplayer/Howyoulikethat.mp3"));
		list.add(new Music("Mago", "��", "C:/Users/smhrd/Desktop/musicplayer/Mago.mp3"));
		list.add(new Music("Maria", "��", "C:/Users/smhrd/Desktop/musicplayer/Maria.mp3"));
		
		Scanner sc = new Scanner(System.in);
		int next = 0;
		int max = 0;
		while(true) {
			System.out.print("1. ��� 2. ���� 3.������ 4.������ 5.����");
			int menu = sc.nextInt();
			
			if(menu==1) {
				//���
				//mp3.play(m1.getPath());
				mp3.play(list.get(0).getPath());
				next = 0;
			}else if(menu==2){
				//����
				mp3.stop();
				mp3.stop();
			}else if(menu==3) {
				
				mp3.stop();
				next=next+1;
				
				mp3.play(list.get(next).getPath());
				
				System.out.println(next);
				if(next==list.size()-1) {
					next = -1;
					
				}

				//��������
			}else if(menu==4) {
				mp3.stop();
				
				if(next==0) {
					next = list.size()-1;
					mp3.play(list.get(next).getPath());
					
					
				} else {
					next=next-1;
					mp3.play(list.get(next).getPath());
					
				}
				System.out.println(next);
				
				
				
				

				//������
			}else if(menu==5) {
				break;

				//����
			}else  {

				//wkfahtdlqfur
			}
		}
		
		
	}

}
