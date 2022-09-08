import java.util.Scanner;

public class TriStarPattern {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		
		int i = 1;
		while (i <= n) {
			int j = 1;
			int startingNumber = i;
			while (j <= i) {
				//print * / i
				System.out.print(startingNumber);  
				startingNumber--;
				j++;
				}
			System.out.println();
			
			i++;
		}
	}

}
