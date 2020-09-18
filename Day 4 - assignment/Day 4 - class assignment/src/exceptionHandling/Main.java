package exceptionHandling;

public class Main {
	public static void main(String[] args) {
		App1 a = new App1();
		double res = 0.0;
		try {
			res = a.calculate(2, 0);
			System.out.println("result: " + res);
			System.out.println("Calculated successfully...");
		} catch (RuntimeException e) {
			System.out.println(e);
		}
		System.out.println("Program end...");
	}
}
