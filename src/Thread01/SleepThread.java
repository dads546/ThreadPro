package Thread01;

/**
 * ��������sleep�е���inerrupt������interrupt�е���sleep�����׳�interruptedException
 * @author songxilong
 *
 */
public class SleepThread extends Thread {
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		super.run();
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
