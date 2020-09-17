package assignment;

public class Computer {
	Monitor monitor;
	Keyboard keyboard;
	Mouse mouse;
	CPU cpu;

//	Computer(String monitorId, String resolution, boolean hdmi, int hdmiCount, String monitorColor,
//			double monitorLength, double monitorBreadth, double monitorHeight, String keyboardId, int noOfKeys,
//			boolean keyboardWired, String keyboardColor, double keyboardLength, double keyboardBreadth,
//			double keyboardHeight, String mouseId, String mouseColor, boolean mouseWired, String cpuId, int memory,
//			int internalStorage, String operatingSystem, int clockSpeed) {
//
//		Monitor monitor = new Monitor(monitorId, resolution, hdmi, hdmiCount, monitorColor, monitorLength,
//				monitorBreadth, monitorHeight);
//		Keyboard keyboard = new Keyboard(keyboardId, noOfKeys, keyboardWired, keyboardColor, keyboardLength,
//				keyboardBreadth, keyboardHeight);
//		Mouse mouse = new Mouse(mouseId, mouseColor, mouseWired);
//		CPU cpu = new CPU(cpuId, memory, internalStorage, operatingSystem, clockSpeed);
//	}

	Computer(Monitor monitor, Keyboard keyboard, Mouse mouse, CPU cpu) {
		this.monitor = monitor;
		this.keyboard = keyboard;
		this.mouse = mouse;
		this.cpu = cpu;
	}

	public static void main(String[] args) {
		Monitor M1 = new Monitor();
		Monitor M2 = new Monitor();
		Keyboard k1 = new Keyboard();
		Keyboard k2 = new Keyboard();
		Mouse m1 = new Mouse();
		Mouse m2 = new Mouse();
		CPU cpu1 = new CPU();
		CPU cpu2 = new CPU();
		
		Computer cmp1 = new Computer(M1,k1,m2,cpu2);
		Computer cmp2 = new Computer(M2,k2,m1,cpu1);
		Computer cmp3 = new Computer(M2,k1,m1,cpu2);
	}

}
