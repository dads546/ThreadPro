package JoinSleep;

import javax.swing.plaf.synth.SynthSpinnerUI;

public class ThreadB extends Thread {
	@Override
	public void run() {
		// TODO Auto-generated method stub
		super.run();
		try {
			System.out.println(" b run begin time = "+System.currentTimeMillis());
			Thread.sleep(5000);
			System.out.println(" b run end time = "+System.currentTimeMillis());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	synchronized public void bService() {
		System.out.println("¥Ú”°¡ÀbService time "+System.currentTimeMillis());
	}
}
