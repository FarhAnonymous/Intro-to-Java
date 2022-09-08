package Assignments;

import java.util.Scanner;

public class SumorProduct {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int N = in.nextInt();
		int C = in.nextInt();
		
		int sum = 0;
		int pro = 1;
		
		if(C == 1) {
			for(int i = 1; i <= N; i++) {
				sum = sum + i;
				}
			System.out.println(sum);
			return;
		}
		
		if(C == 2) {
			for(int j = 1; j <= N; j++) {
				pro = pro * j;
				}
			System.out.println(pro);
			return;
		}
		
		else {
			System.out.println("-1");
			
		}

	}

}
