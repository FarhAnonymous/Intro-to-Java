package Assignments;

import java.util.Scanner;

public class PrintWave {

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

	public static void wavePrint(int mat[][]) {
		if (mat.length == 0) {
			return;
		}
		int rows = mat.length;
		int cols = mat[0].length;

		for (int j = 0; j < cols; j++) {
			if (j % 2 == 0) {
				for (int i = 0; i < rows; i++) {
					System.out.print(mat[i][j] + " ");
				}
			}

			else {
				for (int i = rows - 1; i >= 0; i--) {
					System.out.print(mat[i][j] + " ");
				}
			}

		}
	}

	public static void main(String[] args) {
		int input[][] = take2DInput();
		wavePrint(input);

	}

}
