package exceptionHandling;

public class App2 {
	public double divide(int num1, int num2) {
		double result = 0.0;
		try {
			result = num1 / num2;
		} catch (NullPointerException e) {
			System.out.println("from app 2");
			throw e;
		}
		return result;
	}
}
