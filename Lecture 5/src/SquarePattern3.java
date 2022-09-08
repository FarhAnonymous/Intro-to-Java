import java.util.Scanner;

public class SquarePattern3 {
	
public static void main(String[] args) {
	Scanner in = new Scanner(System.in);
	int n = in.nextInt();
	
//	1234      Here, i(rows) = n
//	1234            j(columns) = n
//	1234            to print  = j.
//	1234
	
	int i = 1;
	while (i <= n) {
		int j = 1;
		while (j <= n) {
			System.out.print(j);
			j++;
		}
		System.out.println();
		i++;
	}
	
}
}
