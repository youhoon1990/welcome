package array;

public class 다이아몬드풀이 {

	public static void main(String[] args) {

	      // 1. 5행 5열의 정수형 이차원 배열을 만들어 주세요.
	      int[][] array = new int[5][5];
	      int cnt = 1;
	      
	      int start = 0;
	      int end = 0;
	      
	   
	      // 5행 5열에 1~25까지 데이터 입력
	      for (int j = 0; j < array.length; j++) {
	         // j : 0 -> 2   /    2
	         // j : 1 -> 1   /    3
	         // j : 2 -> 0   /    4
	         // j : 3 -> 1   /    3
	         // j : 4 -> 2   /    2
	         start = Math.abs(j-2);
	         end = 4-Math.abs(j-2);
	         
	         for (int i = start; i <= end; i++) {
	            array[j][i] = cnt++;
	         }
	      }
	      
	      
	      
	      // 5행 5열에 데이터 출력
	      for (int j = 0; j < array.length; j++) {
	         for (int i = 0; i < array[j].length; i++) {
	            System.out.print(array[j][i] + "\t");
	         }
	         System.out.println();
	      }

	      

	   }

	}