import java.util.Scanner;

public class Test {
	
	public static void  fun(int[][] arr2d)
	{

	    for(int i=0;i<arr2d.length;i++)
	    {
	        for(int j=0;j<arr2d[i].length;j++)
	        {
	            arr2d[i][j]=2*i+j;
	        }
	    }
	}

	public static void main(String[] args) {
//	       int input[][] = new int[3][4];
//	       input[0][1] = 15;
//	       System.out.println(input[0][1]);
//	       
//	       Scanner in = new Scanner(System.in);
//	       
//	       System.out.println("Enter the number of rows:");
//	       int rows = in.nextInt();
//	       System.out.println("Enter the number of Columns:");
//	       int cols = in.nextInt();
//	       
//	       int arr2d[][] = new int[rows][cols];
//	       
//	       for(int i = 0; i < rows; i++) {
//	    	   for(int j = 0; j < cols; j++) {
//	    		   System.out.println("Enter values for " + i + " row " + j + " column:");
//	    		   arr2d[i][j] = in.nextInt();
//	    	   }
//	       }
//	       
//	       for(int i = 0; i < rows; i++) {
//	    	   for(int j = 0; j < cols; j++) {
//	    		   System.out.print(arr2d[i][j] + " ");
//	    	   }
//	    	   System.out.println();
//	       }
//	       
//	       
//		int[][] arr = new int[2][2]; 
//	    fun(arr);
//	    for(int i=0;i<2;i++)
//	    {
//	        for(int j=0;j<2;j++)
//	        {
//	            System.out.print(arr[i][j]+" " );
//	        }
//	    }
//	   
		
		int check = 0 % 2;
		System.out.println(check);
	       

	}

}
