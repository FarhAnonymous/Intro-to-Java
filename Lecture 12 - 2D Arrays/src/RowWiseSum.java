import java.util.Scanner;

public class RowWiseSum {

	public static int[][] take2DInput() {
		Scanner in = new Scanner(System.in);
		int rows = in.nextInt();
		int cols = in.nextInt();

		int arr2d[][] = new int[rows][cols];

		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < cols; j++) {
				arr2d[i][j] = in.nextInt();
			}
		}
		return arr2d;
	}

	public static void rowSum(int mat[][]) {
		int sum = 0;
		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat[i].length; j++) {
				sum += mat[i][j];
			}
			System.out.print(sum + " ");
			sum = 0;
		}

	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int t = in.nextInt();

		while (t > 0) {

			int input[][] = take2DInput();
			rowSum(input);

			t--;
		}

	}

}
