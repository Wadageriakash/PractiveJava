package ArrayListPrograms;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class SecondLargestElement {

    public static void main(String... args) {

        List<Integer> num1 = Arrays.asList(-100, 10, 20, 30, 40, 50, 60);

        // Find the largest and second largest using a single loop
        Integer largest = Integer.MIN_VALUE;
        Integer secondLargest = Integer.MIN_VALUE;

        for (Integer num : num1) {
            if (num > largest) {
                secondLargest = largest; // Update second largest
                largest = num;           // Update largest
            } else if (num > secondLargest && num != largest) {
                secondLargest = num;
            }
        }

        System.out.println("Largest number: " + largest);
        System.out.println("Second largest number: " + secondLargest);

        // Using Java Streams to find the second-largest
        Optional<Integer> secondLargestStream = num1.stream()
                .sorted(Comparator.reverseOrder()) // Sort in descending order
                .skip(1) // Skip the largest element
                .findFirst(); // Get the second-largest element

        System.out.println("Second largest (stream): " + secondLargestStream.orElse(null));
    }
}
