import java.util.Scanner;

public class Assignment1 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int bs = in.nextInt();
	    char g = in.next().charAt(0);
	    
	    double hra = ((0.2*bs));
	    double da = ((0.5*bs));
	    double pf = ((0.11*bs));
	    
	   int allow = 0;
	   
	   if(g == 'A') {
		   allow = 1700;
		  }
	   else if(g == 'B') {
		   allow = 1500;
	      }
	   else{
		   allow = 1300;
	   }
	   
	   double totalSalary = (bs + hra + da + allow - pf);
	   
	   int totalsalary = (int)(totalSalary+0.5);
	   
	   System.out.println(totalSalary);
	   System.out.println(totalsalary);
	  
	    
	    

	}

}
