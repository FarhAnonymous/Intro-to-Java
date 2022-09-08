import java.util.Scanner;

public class Assignment2 {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		int n = in.nextInt();
		int i = 1;
		int pro = 1;
		
		while(i <=10) {
			pro = n * i;
			System.out.println(pro);
			i++;
		}
	}

}
