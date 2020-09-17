package assignment;

public class Mouse {
	private String mouseId;
	private String color;
	private boolean wired;

	Mouse() {
		this.mouseId = "unassigned";
		this.color = "unassigned";
		this.wired = false;
	}

	Mouse(String mouseId, String color, boolean wired) {
		this.mouseId = mouseId;
		this.color = color;
		this.wired = wired;
	}
}
