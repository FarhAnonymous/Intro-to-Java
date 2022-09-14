import java.util.Scanner;

public class Print2DArray {
	
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
	
	public static void print2DArray(int input[][]) {
		int rows = input.length;
		int cols = input[0].length;
		int n = rows;
		
		for(int i = 0; i < rows; i++) {
			for(int j = 1; j <= n; j++) {
				for(int k = 0; k < cols; k++) {
					System.out.print(input[i][k] + " ");
				}
				System.out.println();
			}
			n--;
		}
		
	}

	public static void main(String[] args) {
		
		int input[][] = take2DInput();
		print2DArray(input);
		

	}

}
