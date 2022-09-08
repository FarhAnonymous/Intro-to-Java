import java.util.Scanner;

public class DiamondPattern {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	    int N=sc.nextInt();
	    
	    if(N%2 != 0){
	       int n1=(N+1)/2;
		   int n2=N/2;
			  
		   for(int i=0; i<n1; i++)
			    {
			      for(int j=0; j<n1+i; j++)
			          {
			            if(j < n1-i-1)
			            System.out.print(" ");
			                   
			            else
			            System.out.print("*");
			               }
			      
			                System.out.println();
			            }
		   
			            for(int i=0; i<n2; i++)
			            {
		                    for(int j=0; j<(2*n2-i); j++)
			            	{
			            		if(j < i+1)
			            			System.out.print(" ");
			            		
			            		else
			            			System.out.print("*");
			            	}
		                    
			            	System.out.println();
			            }
			            
			        }
			        
		    }
	

}

