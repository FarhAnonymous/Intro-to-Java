package Assignments;

import java.util.Scanner;

public class TermsofAP {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int x = in.nextInt();
		
		int count = 0;
		
		for(int n = 1; count < x; n++){
			int term = 3*(n) + 2;
			
			if(term % 4 != 0) {
			System.out.print(term + " ");
			count++;
			}
			
			
		}

	}

}
