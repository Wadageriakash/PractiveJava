package ArrayListPrograms;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

// Write a program to find the frequency of each element in an ArrayList.
public class FrequencyOfElement {

	public static void main(String[] args) {

		List<Integer> num1 = Arrays.asList(10, 20, 10, 30, 20, 10);
		usingForloop(num1);
		usingStream(num1); // // using the java stream

	}

	public static void usingForloop(List<Integer> num1) {
		Map<Integer, Integer> frequency = new HashMap<>();

		for (int i = 0; i < num1.size(); i++) {
			int count = 0;
			for (int j = 0; j < num1.size(); j++) {

				if (num1.get(i).equals(num1.get(j))) {
					count++;
				}
			}
			frequency.put(num1.get(i), count);
		}
		System.out.println(frequency); // {20=2, 10=3, 30=1}
	}

	public static void usingStream(List<Integer> num1) {
		
		 // Convert the List<Integer> to an int[]
 
        int[] num2 = num1.stream().mapToInt(Integer::intValue).toArray();

		Map<Integer, Long> freq = Arrays.stream(num2).boxed()
				.collect(Collectors.groupingBy(Integer::intValue, Collectors.counting()));
		
		freq.forEach((key, value) -> System.out.println(key + " -> " + value));

//		20 -> 2
//		10 -> 3
//		30 -> 1
	}

}
