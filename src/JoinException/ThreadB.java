package JoinException;

public class ThreadB extends Thread{
	@Override
	public void run() {
		// TODO Auto-generated method stub
		super.run();
		try {
			ThreadA a = new ThreadA();
			a.start();
			a.join();
			System.out.println("线程B在 run end处打印了");
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			System.out.println("线程B在catch处打印了");
			e.printStackTrace();
		}
	}
}
