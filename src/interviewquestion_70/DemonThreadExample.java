package interviewquestion_70;

// use cases of the DemonThread
/*
 * 01) Garbage collection
 * 02) Server maintenance
 * 03) for cache update*/

public class DemonThreadExample {

	public static void main(String[] args) { // 
		
		startServer();
		
		System.out.println("Main Thread Started...");
		
		try {
			Thread.sleep(5000);
			System.out.println("Main Thread exit..");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private static void startServer() {
		
		Thread loggerThread = new Thread(()->{
			while(true) {
				System.out.println("Logging server activities....");
				try {
					Thread.sleep(2000);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
		
		loggerThread.setDaemon(true);
		loggerThread.start();
		
		// start handling incomming request..
		System.out.println("Server started ready to handle incomming requests....");
	}
}

//Main Thread Started...
//Logging server activities....
//Logging server activities....
//Logging server activities....
//Main Thread exit..