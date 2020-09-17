package assignment;

public class TypeCasting {

	public static void main(String[] args) {
		A a1 = new A(); // A
		a1.method();

		B b1 = new B(); // B
		b1.method();

		A a2 = new B(); // B
		a2.method();

		A a3 = (A) new B(); // B
		a3.method();

		/*
		B b2 = (B) new A(); // error
		b2.method();
		*/
	}

}
