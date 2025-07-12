package interviewquestion_70;

import java.util.concurrent.atomic.AtomicInteger;

class RacingConditionforAtomicity {
    private AtomicInteger count = new AtomicInteger();

    public void increment() {
        count.incrementAndGet();
    }

    public AtomicInteger getCount() {
        return count;
    }
}

public class AtomicityConcept {

    public static void main(String[] args) {

    	RacingConditionforAtomicity race = new RacingConditionforAtomicity();

        // thread 1
        Thread thread1 = new Thread(() -> {
            System.out.println("1st thread started...");
            for (int i = 0; i < 50000; i++) {
                race.increment();
            }
            System.out.println("1st thread stopped...");
        });

        // thread 2
        Thread thread2 = new Thread(() -> {
            System.out.println("2nd thread started...");
            for (int i = 0; i < 50000; i++) {
                race.increment();
            }
            System.out.println("2nd thread stopped...");
        });

        // Start both threads
        thread1.start();
        thread2.start();

        // Wait for threads to complete
        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Fetch and print the result
        System.out.println("Final count: " + race.getCount());
    }
}

//2nd thread started...
//1st thread started...
//1st thread stopped...
//2nd thread stopped...
//Final count: 100000
