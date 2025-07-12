package interviewquestion_70;


/* virtual threads typically have a shallow call stack, performing as few as a single HTTP 
 * client call or a single JDBC query.
 * 
 * ==> A single JVM might support millions of virtual threads.
 * ==> they arenot intended for long-running CPU-intensive opertations.
 * ==> Use virtual threads in high-throughput concurrent applications, especially those that
 * 		consist of a great number of concurrent tasks that spend much of their time waiting.
 * 
 * ==> Virtual threads are not faster threads.
 * ==> They exist to provide scale (higher throughput), not speed (lower latency).*/

public class VirtualThreadExample {

	public static void main(String[] args) {
		
		final int numberOfThreads = 10000;
		
		Runnable objRunnable = () ->{
			String name  = "Instagram";
			// Simulating fetching data
			System.out.println("Fetching the data from " + name);
			try {
				Thread.sleep(5000);
			} catch (Exception e) {
				throw new RuntimeException(e);
			}
		};
		
		for(int i=0; i<numberOfThreads; i++) {
//			Thread thread = new Thread(objRunnable);
			Thread thread = Thread.ofVirtual().unstarted(objRunnable);
			//CPU capacity and memory.
			// Platform threads typically hava a large thread stack and 
			thread.setDaemon(true);
			thread.start();
			String str = String.format("Thread number %s", i);
			System.out.println(str);
		}
	}
}
