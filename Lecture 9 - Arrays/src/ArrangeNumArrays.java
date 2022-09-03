import java.util.Scanner;

public class ArrangeNumArrays {
	
	public static void arrange(int arr[], int n) {
		int start = 0;
        int end = n - 1;
        int value = 1;
    
        while(start <= end) {
          if(value % 2 == 1) {
            arr[start] = value;
            value++;
            start++;
          } 
          else {
            arr[end] = value;
            value++;
            end--;
          }
        }
		
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		
		while (t > 0) {
			int n = in.nextInt();
			int arr[] = new int[n];
			arrange(arr, n);
			t--;
		}

	}

}
