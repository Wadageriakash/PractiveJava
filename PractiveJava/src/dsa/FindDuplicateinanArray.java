package dsa;

import java.util.HashSet;
import java.util.Set;

public class FindDuplicateinanArray {

	public static void main(String[] args) {
		int[] num = {2, 3, 6, 7, 3, 6, 0, 10};
		Set<Integer> seen = new HashSet<>();
        Set<Integer> duplicates = new HashSet<>();

		for(Integer i : num) {
			if(!seen.add(i)){
				duplicates.add(i);
			} else {
				seen.add(i);
			}
		}
		System.out.println("Duplicates: "+ duplicates);
		
	}

}
