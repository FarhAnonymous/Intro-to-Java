package Assignments;

import java.util.Scanner;

public class TotalSumBoundriesDiagonals {

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

	public static void totalSum(int arr[][]) {
		int requiredSum = 0;
		int N = arr.length;
		// Traverse arr[][]
		// Loop from i to N-1 for rows
		for (int i = 0; i < N; i++) {

			// Loop from j = N-1 for columns
			for (int j = 0; j < N; j++) {

				// Condition for diagonal
				// elements
				if (i == j || (i + j) == N - 1) {
					requiredSum += arr[i][j];
				}

				// Condition for Boundary
				// elements
				else if (i == 0 || j == 0 || i == N - 1 || j == N - 1) {
					requiredSum += arr[i][j];
				}
			}
		}

		// Return the final Sum
		System.out.print(requiredSum);
		return;
	}

	public static void main(String[] args) {

		int input[][] = take2DInput();
		totalSum(input);

	}

}
