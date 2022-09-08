import java.util.Scanner;

public class SquarePattern2 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		
//		1111      Here, i(rows) = n
//		2222            j(columns) = n
//		3333            to print = i in each row.
//		4444
//		
		int i = 1;
		while (i <= n) {
			int j = 1;
			while(j <= n) {
				System.out.print(i);
				j++;
			}
			System.out.println();
			i++;
		}

	}

}
