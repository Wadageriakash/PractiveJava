package DesignPatterns.SingletonPattern_CreationPattern.SynchronizedMethod;



//For the Synchronized method it will lock the method for the each method invoking so it is costly
// So that in majority it wonot use.

public class MainClass {

	public static void main(String[] args) {
		
		DBConnection connectionObj = DBConnection.getInstance();
	}
}
