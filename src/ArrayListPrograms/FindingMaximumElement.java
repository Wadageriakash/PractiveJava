package ArrayListPrograms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.OptionalInt;

// Write a program to find the maximum element from an ArrayList of Integers.
public class FindingMaximumElement {

	public static void main(String ... args) {
		
		List<Integer> i1 = new ArrayList<>();
		i1.add(10);
		i1.add(200);
		i1.add(150);
		i1.add(700);
		i1.add(600);
		
		
		System.out.println(Collections.max(i1)); // 700
		System.out.println(Collections.min(i1)); // 10
		
		// Here are three more ways to find the maximum value in a list, using streams:
		List<Integer> nums = Arrays.asList(-1, 2, 1, 7, 3);
		Optional<Integer> max1 = nums.stream().reduce(Integer::max);
		Optional<Integer> max2 = nums.stream().max(Comparator.naturalOrder());
		OptionalInt max3 = nums.stream().mapToInt(p->p).max();
		
		System.out.println("max1 =  " + max1.get());
		System.out.println("max2 =  " + max2.get());
		System.out.println("max3 =  " + max3.getAsInt());
		
		
		
	}
}
