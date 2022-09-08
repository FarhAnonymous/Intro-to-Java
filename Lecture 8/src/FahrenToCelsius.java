import java.security.Principal;
import java.util.Scanner;

public class FahrenToCelsius {
	
	public static void printFahren(int start, int end, int step) {
		int cel = 0;
		while(start <= end) {
			cel = ((start - 32)*5) / 9;
			System.out.println(start + " " + cel);
			start = start + step;
		}
	}
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int start = in.nextInt();
		int end = in.nextInt();
		int step = in.nextInt();
		
        printFahren(start, end, step);

		

		
	}

}
