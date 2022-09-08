package Assignments;

import java.util.Scanner;

public class DecimaltoBinary {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        
        long binary = 0, pow = 1;
        
        while(n > 0){
            int lastbit = n % 2;
            binary = binary + (lastbit*pow);
            pow = pow *10;
            n= n/2;
        }
        System.out.println(binary);
		
	}

}
