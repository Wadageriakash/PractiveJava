package interviewquestion_70;

class RacingCondition {
	private int count;

	public void increment() {
		count++;
	}

	public int getCount() {
		return this.count;
	}
}

public class raceCondition_exampleByThread {

	public static void main(String [] args) {
		RacingCondition race = new RacingCondition();
		
		// thread 1
		new Thread(()-> {
			System.out.println("1st thread started..");
			for(int i =0; i< 50000; i++) {
				race.increment();
			}
			System.out.println("1st thread stopped...");
			}).start();
		
	
		// thread 2
		new Thread(()->{
			System.out.println("2nd thread started...");
			for(int i =0; i< 50000; i++) {
				race.increment();
			}
			System.out.println("2nd thread stopped");
		}).start();
		
		try {
			Thread.sleep(2000);
		} catch(InterruptedException e ) {
			e.printStackTrace();
		}
		int result = race.getCount();
		System.out.println(result);
	}
}

//1st thread started..
//2nd thread started...
//1st thread stopped...
//2nd thread stopped
//83404
