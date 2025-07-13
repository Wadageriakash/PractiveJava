package DesignPatterns.SingletonPattern_CreationPattern.SynchronizedMethod;

public class DBConnection {

	private static DBConnection connectionObj = null;
	
	synchronized public static DBConnection getInstance() {
		if(connectionObj == null) {
			connectionObj =  new DBConnection();
		}
		return connectionObj;
	}
}
