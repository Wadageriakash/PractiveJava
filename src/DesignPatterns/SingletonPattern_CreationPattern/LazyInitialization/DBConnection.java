package DesignPatterns.SingletonPattern_CreationPattern.LazyInitialization;

public class DBConnection {

	private static DBConnection connectionObj = null;
	
	private DBConnection() {
		
	}
	public static DBConnection getInstance() {
		
		if(connectionObj == null) {
			connectionObj = new DBConnection();
		}
		return connectionObj;
	}
}
