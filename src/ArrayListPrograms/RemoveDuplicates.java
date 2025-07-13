package ArrayListPrograms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class RemoveDuplicates {

    public static void main(String... args) {

        List<Integer> nums = new ArrayList<>(Arrays.asList(10, 100, 200, 210, 10, 60, 70, 210));

        // using the for loop
        for (int i = 0; i < nums.size(); i++) {
            for (int j = i + 1; j < nums.size(); j++) {
                if (nums.get(i).equals(nums.get(j))) {
                    nums.remove(j);
                    j--; // Decrement j to correctly handle the shifted indices
                }
            }
        }
        System.out.println("List after removing duplicates (manual loop): " + nums); //[10, 100, 200, 210, 60, 70]
        
        
        // Using a LinkedHashSet to remove duplicates while maintaining order
        Set<Integer> s1 = new HashSet(nums);
        System.out.println(s1); // [210, 100, 70, 200, 10, 60]

        
        // Using the Stream removing the duplicates.
        List<Integer> removedDuplicates =  nums.stream().distinct().collect(Collectors.toList());
        System.out.println("removedDuplicates = " +  removedDuplicates); // [10, 100, 200, 210, 60, 70]
        
    }
}
