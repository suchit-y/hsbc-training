package exceptionHandling;

public class App1 {
	public double calculate(int num1, int num2) {
		App2 a = new App2();
		try {
			return a.divide(num1, num2);
		} catch (RuntimeException e) {
			throw e;
		}
	}
}
