import java.util.Scanner;

public class InterestingAlphabets {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		
		int i = 1;
		while(i <= n) {
			int j = 1;
			char startingChar = (char)(65 + n - i);
			while(j <= i) {
				System.out.print(startingChar);
				startingChar++;
				
				j++;
			}
			System.out.println();
			i++;
		}

	}

}
