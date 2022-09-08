package Assignments;

import java.util.Scanner;

public class BinaryToDecimal {

	public static void main(String[] args) {
		 Scanner in = new Scanner(System.in);
         int N = in.nextInt();
	        
	        int decimal = 0;
	        int pow = 1;
	        
	        while(N > 0){
	        	int last = N % 10;
	        	decimal = decimal + (last * pow);
	        	pow = pow * 2;
	        	N = N/10;
	        }
	        System.out.println(decimal);
	            

	}

}
