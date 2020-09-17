package assignment;

import assignment.interfaces.TvRemote;

public class BplTv implements TvRemote {

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
		BplTv tv1 = new BplTv();
		tv1.channel(123);
		tv1.power(false);
	}
}
