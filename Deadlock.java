/*
 * 4.	Create a Deadlock Scenario Programmatically?
 * Deadlock is a special scenario in the multi-threaded environment where two 
 * or more threads are blocked forever. The deadlock situation arises with at 
 * least two threads and two or more threads. Let’s write a simple program and 
 * execute/run the code to create a deadlock.
 */
class Resource {
	private final String name;

	public Resource(String name) {
		this.name = name;
	}

	public String getName() {
		return this.name;
	}
}

class ThreadA implements Runnable {
	private Resource r1;
	private Resource r2;

	ThreadA(Resource r1, Resource r2) {
		this.r1 = r1;
		this.r2 = r2;
	}

	@Override
	public void run() {
		synchronized (r1) {
			System.out.println("" + r1.getName() + " locked by Thread A");
			synchronized (r2) {
				System.out.println("" + r2.getName() + " locked by Thread A");
			}
		}
	}
}

class ThreadB extends Thread {
	private Resource r1;
	private Resource r2;

	ThreadB(Resource r1, Resource r2) {
		this.r1 = r1;
		this.r2 = r2;
	}

	@Override
	public void run() {
		synchronized (r2) {
			System.out.println("" + r2.getName() + " locked by Thread B");
			synchronized (r1) {
				System.out.println("" + r1.getName() + " locked by Thread B");
			}
		}
	}
}

public class Deadlock {
	public static void main(String[] args) {
		Resource r1 = new Resource("Resource1");
		Resource r2 = new Resource("Resource2");

		ThreadA ta = new ThreadA(r1, r2);
		Thread t1 = new Thread(ta);
		ThreadB t2 = new ThreadB(r1, r2);

		t1.start();

		t2.start();
	}
}