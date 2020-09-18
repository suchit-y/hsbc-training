package assignment;

public class NestedTryCatch {

	public static void main(String[] args) {
		try {
			try {
				System.out.println("try inside try");
				int num[] = { 1, 2, 3 };
				System.out.println(num[4]);
			} catch (ArrayIndexOutOfBoundsException e) {
				System.out.println(e);
			}
			int res = 5 / 0;
			System.out.println(res);
		} catch (ArithmeticException e1) {
			try {
				System.out.println("try inside catch");
				String str = null;
				str.charAt(0);
			} catch (NullPointerException e2) {
				System.out.println(e2);
			}
		}

	}
}
