package assignment;

import assignment.interfaces.TvRemote;

public class PanasonicTv implements TvRemote {

	@Override
	public void channel(int channelNo) {
		System.out.println("Channel: " + channelNo);
	}

	@Override
	public void power(boolean button) {
		if(button == false)
			System.out.println("On");
		else
			System.out.println("Off");
	}
	
	public static void main(String[] args) {
		PanasonicTv tv1 = new PanasonicTv();
		tv1.channel(125);
		tv1.power(false);
	}
}
