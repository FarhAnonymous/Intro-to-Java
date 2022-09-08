package Assignments;

import java.util.Scanner;

public class ParallelogramPat {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		
		int i = 1;
		while (i <= n) {
			int spaces = 1;
			while(spaces <= i-1) {
				System.out.print(" ");
				spaces++;
			}
			
			int j = 1;
			while(j <= n -i+1) {
				System.out.print("*");
				j++;
			}
			
			j = 1;
			while(j <= i-1) {
				System.out.print("*");
				j++;
			}
				
				
			System.out.println();
			i++;
		}
		

	}

}
