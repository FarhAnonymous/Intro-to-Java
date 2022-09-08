package Assignments;

import java.util.Scanner;

public class ReverseNumber {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		
		int revNum = 0;
		while(n > 0) {
			int lastDigit = n % 10;
			revNum = (revNum*10) + lastDigit;
            n = n/10;
		}
		System.out.print(revNum);

	}

}
