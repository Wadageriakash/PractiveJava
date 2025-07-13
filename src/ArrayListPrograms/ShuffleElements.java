package ArrayListPrograms;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

//Write a program to shuffle the elements of an ArrayList.
public class ShuffleElements {

	public static void main(String ... args) {
		
		List<Integer> num1 = new ArrayList<>();
		num1.add(10);
		num1.add(20);
		num1.add(30);
		num1.add(40);
		num1.add(50);
		num1.add(60);
		
		Collections.shuffle(num1);
		System.out.println(num1);
		
		
	}
}
