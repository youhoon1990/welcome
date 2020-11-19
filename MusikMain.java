package d1119;

import java.util.ArrayList;
import java.util.Scanner;

import javazoom.jl.player.MP3Player;

public class MusikMain {

	public static void main(String[] args) {
		MP3Player mp3 = new MP3Player();
		//mp3.play("C:/Users/smhrd/Desktop/musicplayer/Maria.mp3");

		ArrayList<Music> list = new ArrayList<Music>();
		Music m1 = new Music("±ø", "ºñ", "C:/Users/smhrd/Desktop/musicplayer/±ø.mp3");
		list.add(m1);
		
		list.add(new Music("»ìÂ¦¼³Ž®¾î", "ºñ", "C:/Users/smhrd/Desktop/musicplayer/»ìÂ¦¼³Ž®¾î.mp3"));
		list.add(new Music("Howyoulikethat", "ºñ", "C:/Users/smhrd/Desktop/musicplayer/Howyoulikethat.mp3"));
		list.add(new Music("Mago", "ºñ", "C:/Users/smhrd/Desktop/musicplayer/Mago.mp3"));
		list.add(new Music("Maria", "ºñ", "C:/Users/smhrd/Desktop/musicplayer/Maria.mp3"));
		
		Scanner sc = new Scanner(System.in);
		int next = 0;
		int max = 0;
		while(true) {
			System.out.print("1. Àç»ý 2. Á¤Áö 3.´ÙÀ½°î 4.ÀÌÀü°î 5.Á¾·á");
			int menu = sc.nextInt();
			
			if(menu==1) {
				//Àç»ý
				//mp3.play(m1.getPath());
				mp3.play(list.get(0).getPath());
				next = 0;
			}else if(menu==2){
				//Á¤Áö
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

				//´ÙÀ½°îµè±â
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
				
				
				
				

				//ÀÌÀü°î
			}else if(menu==5) {
				break;

				//Á¾·á
			}else  {

				//wkfahtdlqfur
			}
		}
		
		
	}

}
