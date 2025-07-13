package ArrayListPrograms;

import java.util.LinkedList;

//Create a LinkedList and perform various operations like add, remove, and iterate over it.
public class LinkedListOperations {

    public static void main(String[] args) {
    	// Create a LinkedList of country names
    	LinkedList<String> fewCountryname = new LinkedList<>();
    	fewCountryname.add("Nepal");
    	fewCountryname.add("Bhootan");

    	
        // Create a LinkedList of country names
    	LinkedList<String> countryNames = new LinkedList<>();

        // Adding elements to the LinkedList
        countryNames.add("India");
        countryNames.add("USA");
        countryNames.add("Canada");
        countryNames.add("Australia");

        // Display the LinkedList
        System.out.println("Countries: " + countryNames); // [India, USA, Canada, Australia]

        countryNames.add(0, "China");
        countryNames.addFirst("HongKong");
        countryNames.addLast("Srilanka");
        countryNames.addAll(fewCountryname);
        countryNames.addAll(0, fewCountryname);
        
        // Removing an element from the LinkedList
        countryNames.remove("Canada");
        System.out.println("After removal: " + countryNames); // [Nepal, Bhootan, HongKong, China, India, USA, Australia, Srilanka, Nepal, Bhootan]

        
        // Create a copy of the LinkedList	
        LinkedList copylist = (LinkedList)countryNames.clone();
        System.out.println("copyList = " + copylist); // [Nepal, Bhootan, HongKong, China, India, USA, Australia, Srilanka, Nepal, Bhootan]
        
        System.out.println(copylist.getFirst()); // Nepal
        System.out.println(copylist.getLast()); // Bhootan
        System.out.println(copylist.getClass()); //class java.util.LinkedList
        System.out.println(copylist.indexOf(countryNames)); // -1
        System.out.println(copylist.isEmpty()); // false
        System.out.println(copylist.peek()); // Nepal
        System.out.println(copylist.removeFirst()); // Nepal
        System.out.println(copylist.removeFirstOccurrence(copylist)); // false
        System.out.println("copylist = " + copylist); // [Bhootan, HongKong, China, India, USA, Australia, Srilanka, Nepal, Bhootan]

        
    }
}
