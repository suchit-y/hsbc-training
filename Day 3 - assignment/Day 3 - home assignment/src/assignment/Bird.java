package assignment;

public abstract class Bird {
	protected double weight;
	protected String color;

	Bird(double weight, String color) {
		this.weight = weight;
		this.color = color;
	}

	public abstract String fly();
}
