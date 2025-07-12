package ArrayListPrograms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MergeTwoArrayList {

    public static void main(String[] args) {

        List<String> countryname1 = new ArrayList<>(Arrays.asList("India", "US", "UK", "Nepal"));
        List<String> countryname2 = Arrays.asList("Pakistan", "Sri Lanka");

        // Merge the two ArrayLists
        countryname1.addAll(countryname2);

        // Print the merged ArrayList
        System.out.println("Merged List: " + countryname1);
    }
}
