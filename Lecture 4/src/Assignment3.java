import java.util.Scanner;

public class Assignment3 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		
		int sumE = 0;
		int sumO = 0;
		
		while (n > 0) {
			int lastDigit = n%10;
			if (lastDigit % 2 == 0) {
				sumE = sumE + lastDigit;
			}
			else {
				sumO = sumO + lastDigit;
			}
			
			n = n/10;
		}
		System.out.println(sumE + " " + sumO);

	}

}
