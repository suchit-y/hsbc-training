package assignment;

public class MyCalculator {

	// add
	public double add(double num1, double num2) {
		return num1 + num2;
	}

	public double add(double num1, double num2, double num3) {
		return add(num1, num2) + num3;
	}

	public double add(double num1, double num2, double num3, double num4) {
		return add(num1, num2) + add(num3, num4);
	}

	public double add(double num1, double num2, double num3, double num4, double num5) {
		return add(num1, num2) + add(num3, num4, num5);
	}

	public double add(double num1, double num2, double num3, double num4, double num5, double num6) {
		return add(num1, num2, num3) + add(num4, num5, num6);
	}

	// multiply
	public double multiply(double num1, double num2) {
		return num1 * num2;
	}

	public double multiply(double num1, double num2, double num3) {
		return multiply(num1, num2) * num3;
	}

	public double multiply(double num1, double num2, double num3, double num4) {
		return multiply(num1, num2) * multiply(num3, num4);
	}

	public double multiply(double num1, double num2, double num3, double num4, double num5) {
		return multiply(num1, num2) * multiply(num3, num4, num5);
	}

	public double multiply(double num1, double num2, double num3, double num4, double num5, double num6) {
		return multiply(num1, num2, num3) + multiply(num4, num5, num6);
	}

	// subtract
	public double subtract(double num1, double num2) {
		return num1 - num2;
	}

	public double subtract(double num1, double num2, double num3) {
		return subtract(num1, num2) - num3;
	}

	public double subtract(double num1, double num2, double num3, double num4) {
		return subtract(num1, num2, num3) - num4;
	}

	public double subtract(double num1, double num2, double num3, double num4, double num5) {
		return subtract(num1, num2, num3, num4) - num5;
	}

	public double subtract(double num1, double num2, double num3, double num4, double num5, double num6) {
		return subtract(num1, num2, num3, num4, num5) - num6;
	}

	// divide
	public double divide(double num1, double num2) {
		return num1 / num2;
	}

	public double divide(double num1, double num2, double num3) {
		return divide(num1, num2) / num3;
	}

	public double divide(double num1, double num2, double num3, double num4) {
		return divide(num1, num2, num3) / num4;
	}

	public double divide(double num1, double num2, double num3, double num4, double num5) {
		return divide(num1, num2, num3, num4) / num5;
	}

	public double divide(double num1, double num2, double num3, double num4, double num5, double num6) {
		return divide(num1, num2, num3, num4, num5) / num6;
	}

	public static void main(String[] args) {
		MyCalculator mc = new MyCalculator();
		System.out.println(mc.add(10, 20, 30));
	}
}
