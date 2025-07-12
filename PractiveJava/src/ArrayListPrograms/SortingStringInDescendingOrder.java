package ArrayListPrograms;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortingStringInDescendingOrder {

	public static void main(String [] args) {
		
		List<String> employee = new ArrayList<>();
		employee.add("Alice");
		employee.add("Charlie");
		employee.add("Bob");
		employee.add("Anish");
		
		Collections.sort(employee, new CustomizedSortingOrder());
		
		employee.stream().forEach(e -> System.out.println(e));

	}
}


