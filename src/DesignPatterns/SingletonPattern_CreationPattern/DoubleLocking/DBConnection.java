package DesignPatterns.SingletonPattern_CreationPattern.DoubleLocking;

public class DBConnection {

	private static DBConnection connectionObj = null;
	
	public static DBConnection getInstance() {
		if(connectionObj == null) {
			synchronized (DBConnection.class) {
				if(connectionObj == null) {
					connectionObj = new DBConnection();
				}
			}
		}
		return connectionObj;
	}
}
