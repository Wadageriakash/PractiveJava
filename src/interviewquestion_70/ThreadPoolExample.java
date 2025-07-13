package interviewquestion_70;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

// If there is no thread is idle then pool executors will create a task and store it in the blockage queue 
// once the thread is idle then task assigned to the idle thread from the core pool.
public class ThreadPoolExample {

	public static void main(String[] args) {

		// create a thread pool with the fixed size
		ExecutorService executorService = Executors.newFixedThreadPool(2);

		// Submit task to the thread pool
		for (int i = 0; i < 3; i++) {
			final int taskId = i;
			executorService.submit(() -> {
				try {
				System.out.println("Task " + taskId + " Started..");
				System.out.println("Task " + taskId + " executed by thread: " + Thread.currentThread().getName());
				} catch(Exception e) {
					e.printStackTrace();
				}
				});
		}
	}

}
