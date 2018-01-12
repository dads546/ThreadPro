package JoinSleep;

public class ThreadA extends Thread {
	private ThreadB b;

	public ThreadA(ThreadB b) {
		super();
		this.b = b;
	}
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		super.run();
		try {
			synchronized (b) {
				b.start();
				//Thread.sleep(6000);//≤ª Õ∑≈À¯
				b.join(1000);
				System.out.println("join  end");
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
