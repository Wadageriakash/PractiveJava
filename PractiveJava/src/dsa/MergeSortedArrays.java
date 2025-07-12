package dsa;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.IntStream;

//•	Merge Sorted Arrays: Merge two sorted arrays into a single sorted array.

public class MergeSortedArrays {

	public static void main(String[] args) {
		int[] arr1 = { 1, 3, 5, 7 };
		int[] arr2 = { 2, 4, 6, 8 };

		// This is the two-pointer approach.....
		int[] twoPointerApproach = usingTwoPointApproach(arr1, arr2);

		System.out.println("twoPointerApproach = " + Arrays.toString(twoPointerApproach)); // twoPointerApproach = [1,
																							// 2, 3, 4, 5, 6, 7, 8]

		// Using the Stream features.....
		int[] mergeUsingStreamConcat = mergeUsingStreamConcat(arr1, arr2);
		System.out.println("mergeUsingStreamConcat = " + Arrays.toString(mergeUsingStreamConcat)); // mergeUsingStreamConcat = [1, 2, 3, 4, 5, 6, 7, 8]

		
		// MergeSortedArraysArrayList
		int[] MergeSortedArraysArrayList = MergeSortedArraysArrayList(arr1, arr2);
		System.out.println("MergeSortedArraysArrayList = "+ Arrays.toString(MergeSortedArraysArrayList)); // MergeSortedArraysArrayList = [1, 2, 3, 4, 5, 6, 7, 8]


	}

	private static int[] MergeSortedArraysArrayList(int[] arr1, int[] arr2) {
		List<Integer> mergedArray = new ArrayList<>();
		for( int i : arr1) {
			mergedArray.add(i);
		}
		for(int j: arr2) {
			mergedArray.add(j);
		}
		
		 Collections.sort(mergedArray);
		 
		 return  mergedArray.stream().mapToInt(Integer::intValue).toArray();
		
	}

	private static int[] mergeUsingStreamConcat(int[] arr1, int[] arr2) {
		return IntStream.concat(Arrays.stream(arr1), Arrays.stream(arr2))
				.sorted() // This will sort the combined stream
                .toArray();
				
	}

	private static int[] usingTwoPointApproach(int[] arr1, int[] arr2) {
		int m = arr1.length;
		int n = arr2.length;
		int[] mergedArray = new int[m + n]; // Initialize merged array

		int i = 0; // Pointer for arr1
		int j = 0; // Pointer for arr2
		int k = 0; // Pointer for mergedArray

		// Traverse both arrays and add the smaller element to mergedArray
		while (i < m && j < n) {
			if (arr1[i] <= arr2[j]) {
				mergedArray[k] = arr1[i];
				i++;
			} else {
				mergedArray[k] = arr2[j];
				j++;
			}
			k++;
		}

		// If elements are remaining in arr1, add them
		while (i < m) {
			mergedArray[k] = arr1[i];
			i++;
			k++;
		}

		// If elements are remaining in arr2, add them
		while (j < n) {
			mergedArray[k] = arr2[j];
			j++;
			k++;
		}

		return mergedArray;
	}

}
