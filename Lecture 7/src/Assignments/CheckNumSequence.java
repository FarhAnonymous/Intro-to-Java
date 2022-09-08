package Assignments;

import java.util.Scanner;

public class CheckNumSequence {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int prev = in.nextInt();
		int count = 2, current;
		boolean isDec = true;
		
		while(count <= n) {
			current = in.nextInt();
			count++;
			if(current == prev) {
				System.out.println("false");
				return;
			}
			if(current < prev) {
				if(isDec == false) {
					System.out.println("false");
					return;
				}
			}
			else {
				if(isDec == true) {
					isDec = false;
				}
			}
			prev = current;
		}
		System.out.println("true");
	}

}
