package com.demo.thread;

public class ThreadDemo extends Thread {

	public void run() {
		try {
			for (int i = 0; i < 10; i++) {
				System.out.println("Iteration " + (i + 1));
				Thread.sleep(2000);
			}

		} catch (InterruptedException e) {
			System.out.println(e);
		}
	}

	public static void main(String[] args) {
		System.out.println("Main thread starts...");
		ThreadDemo t1 = new ThreadDemo();
		t1.start();
		try {
			t1.join();// main thread doesn't wait for t1 thread if join is not used
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Main thread exits...");
	}

}
