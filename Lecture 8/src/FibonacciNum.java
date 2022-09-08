import java.util.Scanner;

public class FibonacciNum {
	
	public static boolean checkFiboNum(int n) {
		int a = 0;
		int b = 1;
		int c;
		while(a < n) {
			c = a + b;
			a = b;
			b = c;
		}
		if (a == n) {
			return true;
		}
		else {
			return false;
		}
		
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		
		System.out.println(checkFiboNum(n));

	}	

}
