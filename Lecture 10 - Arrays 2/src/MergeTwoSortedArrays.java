import java.util.Scanner;

public class MergeTwoSortedArrays {

	public static int[] takeInput() {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();

		int arr[] = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = in.nextInt();
		}

		return arr;
	}

	public static int[] merge(int arr1[], int arr2[]) {
		int i = 0;
		int j = 0;
		int k = 0;

		int ans[] = new int[arr1.length + arr2.length];

		while (i < arr1.length && j < arr2.length) {
			if (arr1[i] < arr2[j]) {
				ans[k] = arr1[i];
				i++;
				k++;
			} else {
				ans[k] = arr2[j];
				j++;
				k++;
			}
		}

		while (i < arr1.length) {
			ans[k] = arr1[i];
			i++;
			k++;
		}

		while (j < arr2.length) {
			ans[k] = arr2[j];
			j++;
			k++;
		}
		return ans;
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int t = in.nextInt();

		while (t > 0) {
			int input1[] = takeInput();
			int input2[] = takeInput();
			int ans[] = merge(input1, input2);
			for (int i = 0; i < ans.length; i++) {
				System.out.print(ans[i] + " ");
			}

			t--;
		}

	}

}
