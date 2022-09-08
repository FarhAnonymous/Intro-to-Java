import java.util.Scanner;

public class QTriOfNums {

	public static void main(String[] args) {
         Scanner in = new Scanner(System.in);
         int n = in.nextInt();
         
         int i = 1;
         while(i <= n) {
        	 int spaces = 1;
        	 while(spaces <= n-i) {
        		 System.out.print(" ");
        		 spaces++;
        	 }
        	 int j = 1;
        	 int p = i;
        	 while(j <= i) {
        		 System.out.print(p);
        		 p++;
        		 j++;
        	 }
        	  j = 1;
        	  p = 2*i - 2;
        	  while (j <= i-1) {
        		  System.out.print(p);
        		  p--;
        		  j++;
        	  }
        	 
        	 System.out.println();
        	 i++;
         }

	}

}
