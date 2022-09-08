package Assignments;

public class CheckArrayRotation {
	
	public static int rotationCheck(int arr[]) {
		int min = Integer.MAX_VALUE;
		int minIndex = 0;
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] < min) {
				min = arr[i];
				minIndex = i;
			}
		}
		return minIndex;
	}

	public static void main(String[] args) {
		int input[] = {5, 6, 1, 2, 3, 4};
		int rotation = rotationCheck(input);
		System.out.println(rotation);

	}

}
