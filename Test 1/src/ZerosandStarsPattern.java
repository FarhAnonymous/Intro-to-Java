import java.util.Scanner;

public class ZerosandStarsPattern {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
        int n = in.nextInt();
		
		int column = 2*n+1;
		
		for(int i = 1; i <= n; i++) {
			for(int j = 1; j <= column; j++) {
				if(j == i || j == (n+1) || i == (column-j+1) ) {
					System.out.print("*");
				}
				else {
					System.out.print("0");
				}
			}
			System.out.println();
		}

	}

}
