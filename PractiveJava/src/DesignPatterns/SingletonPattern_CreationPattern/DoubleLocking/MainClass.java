package DesignPatterns.SingletonPattern_CreationPattern.DoubleLocking;



//For the double locking it will check wether the object is created or not if it already created
// then it wonot create again. And in industry it majorly used.

public class MainClass {

	public static void main(String[] args) {
		
		DBConnection connectionObj = DBConnection.getInstance();
	}
}
