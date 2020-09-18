package exceptionHandling;

public class Demo1 {

	public static void main(String[] args) {
		System.out.println("Program starts...");
		try {
			int[] nums = { 10, 20, 30, 40 };
			System.out.println(nums[4]);
		} catch (ArrayIndexOutOfBoundsException e) {
			e.printStackTrace();
			System.out.println();
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("Programs ends...");
	}

}
