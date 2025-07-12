package DesignPatterns.PrototypePattern_CreationPattern;

class Students implements Prototype {
	String name;
//	private int rollnum; // due to visibility it is commented... 
	int rollnum;
	int age;

	Students() {
	}

	public Students(String name, int rollnum, int age) {
		this.name = name;
		this.rollnum = rollnum;
		this.age = age;
	}

	@Override
	public Prototype clone() {
		return new Students(name, rollnum, age);
	}

}

public class MainClass {

	public static void main(String[] args) {
		Students obj = new Students("Akash", 136, 27);
		Students cloneObj = (Students) obj.clone();
		System.out.println("name: " + cloneObj.name + ", rollNumber: " + cloneObj.rollnum + ", Age " + cloneObj.age);
		// creating clone of the student object
//		Students cloneObj = new Students();
//		cloneObj.name = obj.name;
//		cloneObj.rollnum = obj.rollnum;
//		cloneObj.age = obj.age;

	}

}
