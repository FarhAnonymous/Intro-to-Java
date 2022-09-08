package Assignments;

import java.util.Scanner;

public class OddSquare {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int row=1;
        while(row<=n){
            int value=2*row-1;
            int j=n;
            while(j>0){
                System.out.print(value);
                value+=2;
                if(value>2*n-1){
                    value=1;
                }
                j--;
            }
            System.out.println();
            row++;
        }

	}

}
