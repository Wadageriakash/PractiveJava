package dsa;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum {

	public static void main(String[] args) {
		int[] num1 ={2, 7, 11, 15};
		int target = 9;

		int[] result = findTwoSum(num1, target);
		System.out.println(Arrays.toString(result));
	}

	public static int[] findTwoSum(int[] num1, int target) {

		Map<Integer, Integer> numMap = new HashMap<>();

		for (int i = 0; i < num1.length; i++) {
			int currentNum = num1[i];
			int complement = target - currentNum;

			if (numMap.containsKey(complement)) {
				return new int[] { numMap.get(complement), i };
			}
			numMap.put(currentNum, i);
		}

		throw new IllegalArgumentException("No two sum solution found");

	}
}
