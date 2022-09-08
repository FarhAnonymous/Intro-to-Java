package Assignments;

public class PushZerostoEnd {
	
	public static void pushZeroEnd(int arr[]) {
		int i = 0;
		int k = 0;
		while(i < arr.length) {
			if(arr[i] == 0) {
				i++;
			}
			else {
				int temp = arr[k];
				arr[k] = arr[i];
				arr[i] = temp;
				k++;
				i++;
			}
		}
	}

	public static void main(String[] args) {
		
		int input[] = {2, 6, 0, 0, 1, 9, 0, 8, 0};
		pushZeroEnd(input);
		for(int i = 0; i < input.length; i++) {
			System.out.print(input[i] + " ");
		}
	}

}
