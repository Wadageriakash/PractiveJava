package interviewquestion_70;

import java.util.List;

class Generic {

	// T extends Number & Comparable<T> this is called multiple type boundary parameter
    // Corrected method
    public static <T extends Number & Comparable<T>> T findMax(List<T> value) {
        
    	if (value == null || value.isEmpty())
            throw new IllegalArgumentException("List is empty");

        T max = value.get(0);

        for (T current : value) {
            if (current.compareTo(max) > 0) {
                max = current;
            }
        }
        return max; 
    }
}


public class BoundaryTypeParameter {

    public static void main(String[] args) {
        List<Integer> intList = List.of(1, 2, 3, 4, 6, 10, 3, 7);
        
        // Calling the corrected findMax method
        Integer max = Generic.findMax(intList);
        System.out.println("Maximum value: " + max); //  Maximum value: 10

        List<Double> doublelist = List.of(1.0, 2.0, 3.0, 20.0, 10.0);
        Double max1 = Generic.findMax(doublelist);
        System.out.println("Maximum value: " + max1); //Maximum value: 20.0

    }
}
