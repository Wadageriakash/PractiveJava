package DesignPatterns.SingletonPattern_CreationPattern.EagerInitialization;

public class DBConnection {

	private static DBConnection connectionObj = new DBConnection();
	
	private DBConnection() {
		
	}
	
	public static DBConnection getInstance() {
		return connectionObj;
	}
	
}
