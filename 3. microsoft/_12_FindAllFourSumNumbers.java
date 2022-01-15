package microsoft;

import java.util.*;

public class _12_FindAllFourSumNumbers {

	public static void main(String[] args) {
		int N = 5, K = 3;
		int A[] =new int[] {0,0,2,1,1};
		System.out.println(fourSum(A, K));
	}

	public static ArrayList<ArrayList<Integer>> fourSum(int[] arr, int k) {
		ArrayList<ArrayList<Integer>> list = new ArrayList<>();
		Arrays.sort(arr);
		int n = arr.length;
		for (int i = 0; i < n - 3; i++) {
			for (int j = i + 1; j < n - 2; j++) {
				int low = j + 1;
				int high = n - 1;
				while (low < high) {
					int sum = arr[i] + arr[j] + arr[low] + arr[high];
					if (sum < k) {
						low++;
					} else if (sum > k) {
						high--;
					} else {

						ArrayList<Integer> list1 = new ArrayList<>();
						list1.add(arr[i]);
						list1.add(arr[j]);
						list1.add(arr[low]);
						list1.add(arr[high]);
						if (!list.contains(list1)) {
							list.add(list1);
						}
						low++;
						high--;
					}
				}
			}
		}
		return list;
	}
}
