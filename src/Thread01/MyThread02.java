package Thread01;

public class MyThread02 extends Thread {

	@Override
	public void run() {
		// TODO Auto-generated method stub
		super.run();
		for(int i= 0;i<10;i++) {
			long time = (long)Math.random()*10000;
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("run"+Thread.currentThread().getName());
		}
	}
}
