package Assignments;

import java.util.Scanner;

public class PrintSpiral {

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

	public static void spiralPrint(int mat[][]) {
		int nRows = mat.length;
		if (nRows == 0) {
			return;
		}
		int mCols = mat[0].length;
		int i, rowStart = 0, colStart = 0;
		int numElements = nRows * mCols, count = 0;
		while (count < numElements) {
			for (i = colStart; count < numElements && i < mCols; ++i) {
				System.out.print(mat[rowStart][i] + " ");
				count++;
			}
			rowStart++;
			for (i = rowStart; count < numElements && i < nRows; ++i) {
				System.out.print(mat[i][mCols - 1] + " ");
				count++;
			}
			mCols--;
			for (i = mCols - 1; count < numElements && i >= colStart; --i) {
				System.out.print(mat[nRows - 1][i] + " ");
				count++;
			}
			nRows--;
			for (i = nRows - 1; count < numElements && i >= rowStart; --i) {
				System.out.print(mat[i][colStart] + " ");
				count++;
			}
			colStart++;
		}
	}

	public static void main(String[] args) {

		int input[][] = take2DInput();
		spiralPrint(input);

	}

}
