package ThreadJoin;

public class ThreadA extends Thread{
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
				System.out.println("A ��ʼ" + System.currentTimeMillis());
				Thread.sleep(5000);
				System.out.println("A ����" + System.currentTimeMillis());
			}
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}
