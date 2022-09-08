import java.util.Scanner;

public class DivideNumbers {
	
	public static int dividing(int a, int b) {
		int ans = a / b;
		return ans;
	}
	
	

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int a = in.nextInt();
		int b = in.nextInt();
		
		System.out.println(dividing(a, b));
		

	}

}
