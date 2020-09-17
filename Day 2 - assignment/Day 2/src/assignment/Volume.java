package assignment;

public class Volume {

	// cuboid
	public void volume(double length, double breadth, double height) {
		System.out.println("Cuboid: " + length * breadth * height);
	}

	// cube
	public void volume(double length) {
		System.out.println("Cube: " + length * length * length);
	}

	// cylinder
	public void volume(double length, double height) {
		System.out.println("Cylinder: " + 3.14 * length * length * height);
	}

	// sphere
	public void volume(int length) {
		System.out.println("Sphere: " + (3.14 * length * length * length * 4) / 3);
	}

	public static void main(String[] args) {
		Volume v = new Volume();
		v.volume(10.1);// cube
		v.volume(10.1, 12.2, 13.3);// cuboid
		v.volume(10.1, 13.3);// cylinder
		v.volume(10);// sphere
	}
}
