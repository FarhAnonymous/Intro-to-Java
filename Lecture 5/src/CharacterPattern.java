import java.util.Scanner;

public class CharacterPattern {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		
		int i = 1;
		while(i <= n) {
			int j = 1;
			char startingChar = (char)('A' + i - 1);
			while(j <= i) {
				System.out.print(startingChar);
				startingChar--;
				j++;
			}
			System.out.println();
			i++;
		}
	}

}
