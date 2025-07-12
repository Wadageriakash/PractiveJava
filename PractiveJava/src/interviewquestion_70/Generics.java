package interviewquestion_70;


// Advantages of Generic class:
// 01) It can work with any datatype and reusablity
// 02) Compile type safety

// 	GenericBox<Integer> x = new GenericBox(); It doesnot work with primitive type datatype

//Common Conventions:
//--------------------------------------------------------
//E - Element (used extensively in Java Collections, e.g., List<E>)
//K - Key (used in maps, e.g., Map<K, V>)
//V - Value (used in maps, e.g., Map<K, V>)
//N - Number (e.g., Comparator<N extends Number>)
//T - Type (a generic type, often used for a single type parameter)
//S, U - Additional types (when multiple type parameters are needed)
//R - Return type (in some functional interfaces or methods)


class GenericBox<T>{
	
	private T a;
	
	public void setA(T a) {
		this.a = a;
	}
	
	public T getA() {
		return this.a;
	}
}

public class Generics {

	public static void main(String [] args) {
		GenericBox<Integer> x = new GenericBox();
		x.setA(1);
		// Here casting is not required
		Integer result  = x.getA();
		System.out.println("result :  " + result); // 1
	}
}
