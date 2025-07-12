package interviewquestion_70;


// to overcome the visibality problem we will use the volatile keyword
class SharedResource {

	private volatile boolean flag = false;
	
	public void setFlag(boolean flag) {
		this.flag = flag;
	}
	
	public boolean getFlag() {
		return flag;
	}
}

public class VisibilityProblemInMultiThreading {
	
	public static void main(String [] args) {
		SharedResource sharedResource = new SharedResource();
		
		// Thread 1 
		new Thread(() -> {
			System.out.println("Thread 1 Started");
			
			try {
				System.out.println("Thread 1 Logic started..");
				Thread.sleep(1000);
				System.out.println("Thread 1 logic completted..");
				sharedResource.setFlag(true);
				System.out.println("Flag set by thread 1");
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}).start();
		
		new Thread(() ->{
			System.out.println("Thread 2 started..");
			while(!sharedResource.getFlag()) {
				// it will run until flag value is true..
			}
			System.out.println("Thread 2 logic completed..");
			
		}).start();
	}
}


//Thread 1 Started
//Thread 1 Logic started..
//Thread 2 started..
//Thread 1 logic completted..
//Flag set by thread 1
//Thread 2 logic completed..
