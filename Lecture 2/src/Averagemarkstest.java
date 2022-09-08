import java.util.Scanner;

public class Averagemarkstest {

	public static void main(String[] args) {
		
       Scanner scan = new Scanner(System.in);
        
        String name = scan.next();
        
        int m1 = scan.nextInt();
        int m2 = scan.nextInt();
        int m3 = scan.nextInt();
        
        int avg = (m1 + m2 + m3) / 3;
        
        System.out.println(name);
        System.out.println(avg);

	}

}
