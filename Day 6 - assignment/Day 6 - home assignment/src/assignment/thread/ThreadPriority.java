package assignment.thread;

public class ThreadPriority extends Thread {

	@Override
	public void run() {
		for (int i = 0; i < 10; i++)
			System.out.println("This is display method from " + Thread.currentThread().getName());
	}

	public static void main(String[] args) {
		ThreadPriority t1 = new ThreadPriority();
		ThreadPriority t2 = new ThreadPriority();
		ThreadPriority t3 = new ThreadPriority();

		t1.setPriority(MIN_PRIORITY);
		t2.setPriority(MAX_PRIORITY);

		t1.start();
		t2.start();
		t3.start();

		try {
			t1.join();
			t2.join();
			t3.join();
		} catch (InterruptedException e) {
			System.out.println(e);
		}

		System.out.println("t1 priority: " + t1.getPriority());
		System.out.println("t2 priority: " + t2.getPriority());
		System.out.println("t3 priority: " + t3.getPriority());
	}

}
