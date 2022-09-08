import java.util.Scanner;

public class Input {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Input first number: ");
		int a = scan.nextInt();
		
		System.out.print("Input second number: ");
		int b = scan.nextInt();
		
		int c = a + b;
		
		System.out.print("Your sum is " + c + ".");

	}

}
