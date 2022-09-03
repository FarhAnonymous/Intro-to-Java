import java.util.Scanner;

public class Sort01 {
	
	public static int[] takeInput() {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int arr[] = new int[n];
		
		for(int j = 0; j < n; j++) {
				arr[j] = in.nextInt();
			}
			return arr;
		}
	
	public static void sortzerosones(int arr[]) {
		int s = 0;
		for(int i=0;i<arr.length;i++){
            if(arr[i]==0){
                int temp=arr[i];
                arr[i]=arr[s];
                arr[s]=temp;
                s++;
            }
		}
	}
    public static void main(String[] args) {
    	Scanner in = new Scanner(System.in);
    	int t = in.nextInt();
    	
    	while(t > 0) {
    		int input[] = takeInput();
    		t--;
    		
    	}
		

	}

}
