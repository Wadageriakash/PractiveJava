package interviewquestion_70;

// G1 also called the Garbage First
public class G1Demo {

	public static void main(String [] args) {
		// allocate objects in a loop
		for(int i = 0; i < 10000; i++) {
			Object obj = new Object();
		}
		
		// Explicitly trigger the Garbage Collection
		System.gc();
		
		// sleep for a short
		try {
			Thread.sleep(5000);
		} catch(Exception e) {
			e.printStackTrace();
		}
	
		byte[] largeArray = new byte[150*1024*1024];
		
		// Allocate more objects after garbage collection
		for(int i = 0; i<5000; i++) {
			Object obj = new Object();
		}
		
		// Explicitly trigger the Garbage Collection
		System.gc();
	}
	
}
