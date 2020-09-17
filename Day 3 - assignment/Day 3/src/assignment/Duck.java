package assignment;

public class Duck extends Bird {

	Duck(double weight, String color) {
		super(weight, color);
	}

	@Override
	public String fly() {
		System.out.println("A " + this.color + " duck is flying...");
		return null;
	}

	public static void main(String[] args) {
		Duck d = new Duck(3.8, "White");
		d.fly();
	}
}
