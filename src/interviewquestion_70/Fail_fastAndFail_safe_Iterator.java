package interviewquestion_70;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

// fail safe will consume more memory due to it works with the clone list
public class Fail_fastAndFail_safe_Iterator {

	public static void main(String [] args) {
//		List<Integer> list = new ArrayList();
//		list.add(100);
//		list.add(200);
//		list.add(300);
		
		// better to create weekly consistant
		List<Integer> list = new CopyOnWriteArrayList<>(); 
		list.add(100);
		list.add(200);
		list.add(300);
		
		Iterator iterator = list.iterator();
		
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
			list.add(600); // for this will get exception (java.util.ConcurrentModificationException)
			
		}
		
		// 100
//		200
//		300

	}
}
