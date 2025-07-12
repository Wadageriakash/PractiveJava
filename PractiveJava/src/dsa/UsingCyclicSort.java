package dsa;

import java.util.Arrays;

public class UsingCyclicSort {

	public static void main(String[] args) {

//		int[] arr1 = { 1, 2, 4, 6, 3, 7, 8 };
		int[] arr1 = { -1, 2, 4, 6, 3, 7, 8, 9, 10};
		System.out.println(arr1); // [I@cac736f
		System.out.println(arr1.toString()); // [I@cac736f
		System.out.println(Arrays.toString(arr1)); // [-1, 2, 4, 6, 3, 7, 8, 9, 10]

		
		int missingNumber = findMissingNumber(arr1);
		System.out.println("Missing Number : "+ missingNumber); // 1
	}
	
	public static int findMissingNumber(int [] nums) {
		
		int i = 0;
		int n = nums.length; // n here is the actual length of the given array (n-1 elements)
		
		while(i < n) {
			int correctIndex = nums[i]-1;
//			boolean res =  nums[i] != nums[correctIndex];
//			boolean res1 = nums[i]>0;
//			boolean res2 = nums[i] <= n;
			if(nums[i]>0 && nums[i] <= n && nums[i] != nums[correctIndex]) {
				swap(nums, i, correctIndex);
			} else {
				i++;
			}
		}
		
        // Find the first index where the number is not i + 1
		for(int j =0; j<n; j++) {
			if(nums[j] != j+1) {
				return j+1;
			}
		}
		
		return n+1;
	}

	private static void swap(int[] nums, int i, int correctIndex) {
		int temp = nums[i];
		nums[i] = nums[correctIndex];
		nums[correctIndex] = temp;
	}
	
}
