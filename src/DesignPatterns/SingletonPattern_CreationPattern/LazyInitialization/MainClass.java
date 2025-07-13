package DesignPatterns.SingletonPattern_CreationPattern.LazyInitialization;

// For the Lazy Connection whenever the instance is required then it will invoke into the method 
// and create instnace.

public class MainClass {

	public static void main(String[] args) {
		
		DBConnection connectionObj = DBConnection.getInstance();
	}
}
