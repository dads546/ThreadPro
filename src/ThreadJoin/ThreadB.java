package ThreadJoin;

public class ThreadB extends Thread{
	@Override
	synchronized public void run() {
		// TODO Auto-generated method stub
		super.run();
		try {
			System.out.println("B ��ʼ" + System.currentTimeMillis());
			Thread.sleep(5000);
			System.out.println("B ����" + System.currentTimeMillis());
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
