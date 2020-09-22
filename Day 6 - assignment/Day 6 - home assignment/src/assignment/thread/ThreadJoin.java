package assignment.thread;

public class ThreadJoin extends Thread {
	@Override
	public void run() {
		try {
			System.out.println("in thread " + Thread.currentThread().getName());
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			System.out.println(e);
		}
	}

	public static void main(String[] args) {
		ThreadJoin t1 = new ThreadJoin();
		System.out.println("main thread started...");
		t1.start();
		try {
			t1.join();
		} catch (InterruptedException e) {
			System.out.println(e);
		}
		System.out.println("main thread ends...");
	}

}
