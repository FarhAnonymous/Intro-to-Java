package Assignments;

import java.util.Scanner;

public class SqaureRoot {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int N = in.nextInt();
		
		int sqrt = 1;
		int i = 1;
		while(i > 0) {
			int pro = i * i;
			if(pro > N) {
				sqrt = i-1;
				break;
			}
			i++;
		}
	System.out.println(sqrt);

}
}
