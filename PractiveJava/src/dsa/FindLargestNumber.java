package dsa;

import java.util.Arrays;
import java.util.OptionalInt;

public class FindLargestNumber {

	public static void main(String ... args) {
		int[] num = new int[6];
		num[0] = 10;
		num[1] = 20;
		num[2] = 60;
		num[3] = 30;
		num[4] = 100;
		num[5] = 90;
		
		System.out.println(num); // [I@cac736f
		System.out.println(Arrays.toString(num)); // [10, 20, 60, 30, 100, 90]
		
		int largestnum = num[0];
		for(int i = 0; i < num.length; i++) {
			if(num[i] > largestnum) {
				largestnum = num[i];
			}
		}
		System.out.println("Largest Number : " + largestnum); // Largest Number : 100
		
		// using the stream concept with the Array
		OptionalInt largestNum = Arrays.stream(num).reduce(Integer :: max); 
		System.out.println("largestNum : " + largestNum.getAsInt()); // 100
	}
}
