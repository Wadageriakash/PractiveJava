package ArrayListPrograms;

import java.util.Comparator;

public class  CustomizedSortingOrder implements Comparator {

	public int compare(Object obj1, Object obj2) {
		
		String s1 = obj1.toString();
		String s2 = obj2.toString();
		
//		return s2.compareTo(s1);
		return -s1.compareTo(s2);
		
		
	}

}
