import java.util.Scanner;

public class Assignment5 {

	public static void main(String[] args) {
		 Scanner in = new Scanner(System.in);
		 int x = in.nextInt();
		 int n = in.nextInt();
		 
		 int i = 1;
		 int pow = 1;
		 
		 while(i <= n) {
			 pow = pow * x;
			 i++;
			 
		 }
		 System.out.println(pow);
		 

	}

}
