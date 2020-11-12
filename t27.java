package festival;

public class t27 {

	public static void main(String[] args) {
		int[][] array = new int [5][5];
		char num = 65;

		int m = 5/2;
		

		for(int row=0; row<5; row++){

			if(row<=m){

				for(int col=row; col<=(5-1)-row; col++){

					array[row][col]=num++;

				}

			}else{

				for(int col=(5-1)-row; col<=row; col++){

					array[row][col]=num++;

				}

			}

		}
		for(int row=0; row<5; row++){

			for(int col=0; col<5; col++){

				System.out.printf("%3c",array[row][col]);

			}

			System.out.println();

		}








	}

}
