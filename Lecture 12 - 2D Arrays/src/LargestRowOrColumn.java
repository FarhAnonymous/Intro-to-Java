import java.util.Scanner;

public class LargestRowOrColumn {

	public static int[][] takeInput() {
		Scanner in = new Scanner(System.in);
		int rows = in.nextInt();
		int cols = in.nextInt();

		int arr[][] = new int[rows][cols];

		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < cols; j++) {
				arr[i][j] = in.nextInt();
			}
		}
		return arr;
	}

	public static void findLargest(int mat[][]) {
		if (mat.length == 0) {
			System.out.print("row 0 " + Integer.MIN_VALUE);
			return;
		}

		int rows = mat.length;
		int cols = mat[0].length;

		int sum = 0;
		int largest = Integer.MIN_VALUE;
		int rowcolNum = 0;

		String msg = "";

		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < cols; j++) {
				sum += mat[i][j];
			}
			if (sum > largest) {
				msg = "row";
				rowcolNum = i;
				largest = sum;
			}
			sum = 0;
		}

		for (int j = 0; j < cols; j++) {
			for (int i = 0; i < rows; i++) {
				sum += mat[i][j];
			}
			if (sum > largest) {
				msg = "column";
				rowcolNum = j;
				largest = sum;
			}
			sum = 0;
		}

		System.out.println(msg + " " + rowcolNum + " " + largest);
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int t = in.nextInt();

		while (t > 0) {
			int input[][] = takeInput();
			findLargest(input);
			t--;
		}

	}
}
