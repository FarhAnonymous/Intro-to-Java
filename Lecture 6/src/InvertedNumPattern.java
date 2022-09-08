import java.util.Scanner;

public class InvertedNumPattern {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		
		int i = 1;
		while (i <= n) {
			int j = 1;
			while(j <= n - i +1) {
				System.out.print(n - i + 1);
				j++;
			}
			System.out.println();
			i++;
		}

	}

}
