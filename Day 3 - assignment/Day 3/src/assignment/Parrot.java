package assignment;

public class Parrot extends Bird {

	Parrot(double weight, String color) {
		super(weight, color);
	}

	@Override
	public String fly() {
		System.out.println("A " + this.color + " parrot is flying...");
		return null;
	}

	public static void main(String[] args) {
		Parrot p = new Parrot(1.75, "Green");
		p.fly();
	}
}
