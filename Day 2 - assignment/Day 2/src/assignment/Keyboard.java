package assignment;

public class Keyboard {
	private String keyboardId;
	private int noOfKeys;
	private boolean wired;
	private String color;
	private double length, breadth, height;

	Keyboard() {
		this.keyboardId = "unassigned";
		this.noOfKeys = 0;
		this.wired = false;
		this.color = "unassigned";
		this.length = 0;
		this.breadth = 0;
		this.height = 0;
	}

	Keyboard(String keyboardId, int noOfKeys, boolean wired, String color, double length, double breadth,
			double height) {
		this.keyboardId = keyboardId;
		this.noOfKeys = noOfKeys;
		this.wired = wired;
		this.color = color;
		this.length = length;
		this.breadth = breadth;
		this.height = height;
	}
}
