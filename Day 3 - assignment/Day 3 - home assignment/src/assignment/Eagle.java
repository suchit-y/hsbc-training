package assignment;

public class Eagle extends Bird {

	Eagle(double weight, String color) {
		super(weight, color);
	}

	@Override
	public String fly() {
		System.out.println("A " + this.color + " eagle is flying...");
		return null;
	}

	public static void main(String[] args) {
		Eagle e = new Eagle(4.3, "Black");
		e.fly();
	}
}
