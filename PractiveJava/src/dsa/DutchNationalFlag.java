package dsa;

import java.util.Arrays;

/*•	Sort an array of 0s, 1s, and 2s (Dutch National Flag problem): Given an array containing
  only 0s, 1s, and 2s, sort the array in O(n) time complexity. */

public class DutchNationalFlag {

	public static void main(String[] args) {
		int[] arr1 = {0, 1, 2, 0, 1, 2};
		System.out.println("Original Array =  "+ Arrays.toString(arr1)); // [0, 1, 2, 0, 1, 2]
		 sort012(arr1);
		 System.out.println("Sorted array = " + Arrays.toString(arr1) ); // [0, 0, 1, 1, 2, 2]
	}

	private static void sort012(int[] arr1) {
		int low = 0;
		int mid = 0;
		int high = arr1.length-1;
		
        // Iterate through the array until the mid pointer crosses the high pointer
		while(mid <= high) {
			switch(arr1[mid]) {
			case 0:
				// If the element is 0, swap it with the element at 'low'
                // and increment both 'low' and 'mid' pointers.
				swap(arr1, low, mid);
				low++;
				mid++;
				break;
			case 1:
				 // If the element is 1, it's already in its correct place
                // relative to 0s and 2s, so just increment 'mid'.
				mid++;
				break;
			case 2:
				// If the element is 2, swap it with the element at 'high'
                // and decrement 'high' pointer. 'mid' is not incremented
                // because the swapped element at 'mid' could be 0, 1, or 2
                // and needs to be re-evaluated.
				swap(arr1, mid, high);
				high--;
				break;
			}
		}
		
		
	}

	private static void swap(int[] arr1, int low, int mid) {
		int temp = arr1[low];
		arr1[low] = arr1[mid];
		arr1[mid] = temp;
	}
}
