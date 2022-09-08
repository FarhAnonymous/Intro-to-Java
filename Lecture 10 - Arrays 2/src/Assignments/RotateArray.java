package Assignments;

public class RotateArray {
	
	public static void rotate(int arr[], int d) {
		
		 int n=arr.length,i,k,j=0;
		 
	        int temp[]=new int[d];
	        for(i=0;i<d;i++)
	        {
	            temp[i]=arr[i];
	        }
	        for(i=0;i<n-d;i++)
	        {
	            arr[i]=arr[i+d];
	        }
	        for( ;i<n;i++)
	        {
	            arr[i]=temp[j++];
	        }
	}

	public static void main(String[] args) {
		int input[] = {1, 2, 3, 4, 5, 6, 7};
		int d = 2;
		rotate(input, d);
		for(int i = 0; i < input.length; i++) {
			System.out.print(input[i] + " ");
		}

	}

}
