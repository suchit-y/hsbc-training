package assignment;

import assignment.interfaces.TvRemote;

public class SonyTv implements TvRemote {

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
		SonyTv tv1 = new SonyTv();
		tv1.channel(124);
		tv1.power(true);
	}
}
