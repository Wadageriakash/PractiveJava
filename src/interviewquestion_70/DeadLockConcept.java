package interviewquestion_70;


/* DeadLock is a situation in multithreading where two or more threads are blocked forever,
 * waiting for eachother to release a resources. This typically occurs when two or more threads
 * have circular dependencies on a set locks*/


class Pen{
	public synchronized void writeWithPenAndPaper(Paper paper) {
		System.out.println(Thread.currentThread().getName() + "is using pen " + this + " and trying");
		paper.finishWriting();
	}
	
	public synchronized void finishWriting() {
		System.out.println(Thread.currentThread().getName() + " finished using pen " + this);
	}
}

class Paper{
	
	public synchronized void writeWithPaperAndPen(Pen pen) {
		System.out.println(Thread.currentThread().getName() + " is using paper " + this + " and trying");
		pen.finishWriting();
	}
	
	public synchronized void finishWriting() {
		System.out.println(Thread.currentThread().getName() + " finished using paper " + this);
	}
}

class Task1 implements Runnable{
	private Pen pen;
	private Paper paper;
	
	public Task1(Paper paper, Pen pen) {
		this.paper = paper;
		this.pen = pen;
	}
	@Override
	public void run() {
		synchronized(paper) {
			pen.writeWithPenAndPaper(paper);
		}
	}
}

class Task2 implements Runnable{
	private Pen pen;
	private Paper paper;
	
	public Task2(Paper paper, Pen pen) {
		this.paper = paper;
		this.pen = pen;
	}
	
	@Override
	public void run() {
		synchronized(pen) {
			paper.writeWithPaperAndPen(pen);
		}
		
	}
}

public class DeadLockConcept {
	
	public static void main(String [] args) {
		
		Pen pen  = new Pen();
		Paper paper  = new Paper();
		
		Thread thread1 = new Thread(new Task1(paper, pen));
		Thread thread2 = new Thread(new Task2(paper, pen));
		
		thread1.start();
		thread2.start();
	}
}
