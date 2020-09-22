package assignment.thread.app;

public class Greet {
	public synchronized void print(String name) {
		System.out.println("Hi, " + name + ". Nice to meet you.");
	}
}
