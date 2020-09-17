package assignment;

public class CPU {
	private String cpuId;
	private int memory, internalStorage;
	private String operatingSystem;
	private int clockSpeed;

	CPU() {
		this.cpuId = "unassigned";
		this.memory = 0;
		this.internalStorage = 0;
		this.operatingSystem = "unassigned";
		this.clockSpeed = 0;
	}

	CPU(String cpuId, int memory, int internalStorage, String operatingSystem, int clockSpeed) {
		this.cpuId = cpuId;
		this.memory = memory;
		this.internalStorage = internalStorage;
		this.operatingSystem = operatingSystem;
		this.clockSpeed = clockSpeed;
	}
}
