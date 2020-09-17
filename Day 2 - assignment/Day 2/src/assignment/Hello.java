package assignment;

public class Hello {
	public void hello(short i) {
		System.out.println("short");
	}

	public void hello(int i) {
		System.out.println("int");
	}

	public void hello(byte i) {
		System.out.println("byte");
	}

	public void hello(long i) {
		System.out.println("long");
	}

	public static void main(String[] args) {
		Hello h = new Hello();
		h.hello(5);
	}

}
