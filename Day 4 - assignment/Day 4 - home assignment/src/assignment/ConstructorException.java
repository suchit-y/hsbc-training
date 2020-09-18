package assignment;

public class ConstructorException {
	int divide;

	ConstructorException() {
		throw new ArithmeticException();
	}

	public static void main(String[] args) {
		try {
			ConstructorException ce = new ConstructorException();
		} catch (ArithmeticException e) {
			System.out.println(e);
		}
	}

}
