package assignment;

public class Monitor {
	private String monitorId;
	private String resolution;
	private boolean hdmi;
	private int hdmiCount;
	private String color;
	private double length, breadth, height;

	Monitor() {
		this.monitorId = "unassigned";
		this.resolution = "unassigned";
		this.hdmi = false;
		this.hdmiCount = 0;
		this.color = "unassigned";
		this.length = 0;
		this.breadth = 0;
		this.height = 0;
	}

	Monitor(String monitorId, String resolution, boolean hdmi, int hdmiCount, String color, double length,
			double breadth, double height) {
		this.monitorId = monitorId;
		this.resolution = resolution;
		this.hdmi = hdmi;
		this.hdmiCount = hdmiCount;
		this.color = color;
		this.length = length;
		this.breadth = breadth;
		this.height = height;
	}
}
