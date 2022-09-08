package Assignments;

public class SecondLargestArray {

	public static int secondLarget(int arr[]) {
		int max = Integer.MIN_VALUE;
		int max2 = Integer.MIN_VALUE;
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] > max) {
					max = arr[i];
				}
			}
		for(int j = 0; j < arr.length; j++) {
			if(arr[j] > max2 && arr[j] < max) {
				max2 = arr[j];
			}
		}
		return max2;
	}
	
	
	public static void main(String[] args) {
		int input[] = {2, 13, 4, 1, 3, 6, 28};
		int max = secondLarget(input);
		System.out.println(max);
		
	
		

	}

}
