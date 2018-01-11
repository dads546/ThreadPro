package Thread01;

/**
 * 不论是在sleep中调用inerrupt还是在interrupt中调用sleep都会抛出interruptedException
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
