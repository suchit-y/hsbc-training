
public class Duck {
	static int duckCount = 0;
	
	static {
		System.out.println("Static block");
	}

	Duck() {
		duckCount++;
	}

}
