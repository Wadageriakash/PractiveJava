package ArrayListPrograms;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

// Write a program to find the second-largest element in an ArrayList of Integers.
public class LargestElement {
	
	public static void main(String ... args) {
		
		List<Integer> num1 = Arrays.asList(-100,10,20,30,40,50,60);
		
		// using the for loop....
		Integer secondLargestnum = num1.get(0);
		for(int i = 0; i < num1.size(); i++) {
			if(num1.get(i) > secondLargestnum) {
				secondLargestnum = num1.get(i);
			}
		}
		System.out.println(" secondLargestnum = " + secondLargestnum); // 60
		
		// print the max number from the arraylist
		Optional<Integer> maxnum = num1.stream().reduce(Integer :: max);
		Optional<Integer> maxnum1 = num1.stream().max(Comparator.naturalOrder());
		
		System.out.println("maxnum = " + maxnum.get()); // 60
		System.out.println("maxnum1 = " + maxnum1.get()); // 60
	}
}
