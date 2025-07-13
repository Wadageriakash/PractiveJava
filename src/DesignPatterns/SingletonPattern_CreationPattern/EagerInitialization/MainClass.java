package DesignPatterns.SingletonPattern_CreationPattern.EagerInitialization;


// 4 ways to achive this:
// 01) Eager
// 02) Lazy
// 03) Synchronized method
// 04) Double Locking
public class MainClass {

	public static void main(String[] args) {
		
		DBConnection connectionObj = DBConnection.getInstance();
		
	}
}
