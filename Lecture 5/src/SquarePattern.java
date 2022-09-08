import java.util.Scanner;

public class SquarePattern {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int i = 1;
		
		// Here, i = nos of rows and it depends upon the n.
		while(i <= n) {
			// Here, j = number of columns and it depends upon n.
			int j = 1;
			while(j <= n) {
				// Here, we need to print n.
				System.out.print(n);
				j++;
			}
			System.out.println();
			i++;
		}
	}

}
