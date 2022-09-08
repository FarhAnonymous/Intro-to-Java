import java.util.Scanner;

public class Functions {
	
	public static int factorial(int n) {
		int ans = 1;
		for(int i = 1; i <= n; i++) {
			ans = ans *i;
		}
		return ans;
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int r = in.nextInt();
		
		int num = factorial(n);
		int den1 = factorial(r);
		int den2 = factorial(n-r);
		
		int ncr = num/(den1*den2);
		System.out.println(ncr);
		

	}

}
