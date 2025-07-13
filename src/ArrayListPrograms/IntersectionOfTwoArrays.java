package ArrayListPrograms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

// Write a program to find the intersection of two ArrayLists.
public class IntersectionOfTwoArrays {

	public static void main(String... args) {

		List<Integer> num1 = Arrays.asList(10, 30, 70, 100);
		List<Integer> num2 = Arrays.asList(30, 70, 60, 20);

		// using the retain all method
		List<Integer> intersection1 = new ArrayList(num1);
		intersection1.retainAll(num2);
		System.out.println(intersection1); // [30, 70]

		// using the java stream
		List<Integer> findInterSection = num1.stream().filter(num2::contains).collect(Collectors.toList());
		System.out.println(findInterSection); // [30, 70]

		// removing duplicates from the both list and print all elements at a single
		// list [Union]
		List<Integer> union = Stream.concat(num1.stream(), num2.stream()).distinct().collect(Collectors.toList());
		System.out.println(union); // [10, 30, 70, 100, 60, 20]

	
	}
}
