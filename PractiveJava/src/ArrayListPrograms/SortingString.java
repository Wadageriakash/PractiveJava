package ArrayListPrograms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SortingString {

	// Write a program to sort an ArrayList of Strings alphabetically.
	public static void main(String [] args) {
		
		// serializable, clonable, comparable
		List<String> cityname = new ArrayList<>();
		cityname.add("Banglore");
		cityname.add("Hubbali");
		cityname.add("Kalburgi");
		cityname.add("Mumbai");
		
		Collections.sort(cityname);
		
		cityname.stream()
		.forEach(System.out::println);
		
		
		// using the toString
		System.out.println("cityname = " + cityname);
		
		

		// using the lambda expression
		cityname.forEach(e -> System.out.println(e));
		
		System.out.println("========================");
		
		cityname.forEach((String e) -> System.out.println(e));
		
//		Lambda Expression (method reference) to print arraylist
		cityname.forEach(System.out::print);
	}
}
