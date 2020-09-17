
public class Box {
	private double length = 0.0, breadth = 0.0, height = 0.0;
	private String color = "Not set";

	Box(double length, double breadth, double height) {
		this.length = length;
		this.breadth = breadth;
		this.height = height;
	}

	Box(double length) {
		this(length, length, length);
	}

	Box(double length, String color) {
		this(length, length, length, color);
	}

	Box(double length, double breadth, double height, String color) {
		this(length, breadth, height);
		this.color = color;
	}

	public double getVolume() {
		return length * breadth * height;
	}

	public String getColor() {
		return color;
	}
}
