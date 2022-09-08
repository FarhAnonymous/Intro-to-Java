import java.util.Scanner;
import java.util.Scanner;
public class NumStartPattern1 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		
		int i = 1;
		while(i <= n) {
			int j = 1;
			while(j <= n) {
				if(n - j + 1 == i) {
					System.out.print("*");
				}
				else {
					System.out.print(n - j + 1);
				}
				j++;
			}
			System.out.println();
			i++;
		}

	}

}
