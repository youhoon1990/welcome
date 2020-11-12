package festival3;

public class t27 {

	public static void main(String[] args) {
		int cnt = 1;
		int arr[][] = new int[5][5];

		for (int j = 0; j < 5; j++) {
			for (int i = 0; i < 5; i++) {
				arr[j][i] = cnt++;
			}
		}
		for (int j = 0; j < 5; j++) {
			for (int i = 0; i < 5; i++) {
				System.out.print(arr[j][i] + "\t");
			}
			System.out.println();

		}

	}

}
