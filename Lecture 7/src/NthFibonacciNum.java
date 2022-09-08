import java.util.Scanner;

public class NthFibonacciNum {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
        int a = 0;
        int b = 1;
        int c;
        for(int i = 1; i <= n ; i++){
            c = a + b;
            a = b;
            b = c;
        }
        System.out.println(a);
	}

}
