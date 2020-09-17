
public class BoxDemo {
	public static void main(String[] args) {
		Box b1 = new Box(10, 20, 30);
		System.out.println(b1.getVolume() + " " + b1.getColor());

		Box b2 = new Box(10, 20, 30, "Blue");
		System.out.println(b2.getVolume() + " " + b2.getColor());

		Box b3 = new Box(20, "Red");
		System.out.println(b3.getVolume() + " " + b3.getColor());
	}
}
