package assignment;

public class InstanceOf {

	public static void main(String[] args) {
		Duck d = new Duck(3.5, "White");
		System.out.print("d instanceof Duck: ");
		System.out.println(d instanceof Duck);

		Bird bd = new Duck(3.2, "Yellow");
		System.out.print("bd instanceof Bird: ");
		System.out.println(bd instanceof Bird);
		System.out.print("bd instanceof Duck: ");
		System.out.println(bd instanceof Duck);

		Artist a = new Artist();
		System.out.print("a instanceof Artist: ");
		System.out.println(a instanceof Artist);

		A obj1 = new A();
		B obj2 = new B();
		A obj3 = new B();
		System.out.print("obj1 instanceof A: ");
		System.out.println(obj1 instanceof A);
		System.out.print("obj2 instanceof B: ");
		System.out.println(obj2 instanceof B);
		System.out.print("obj3 instanceof A: ");
		System.out.println(obj3 instanceof A);
		System.out.print("obj3 instanceof B: ");
		System.out.println(obj3 instanceof B);
	}

}
