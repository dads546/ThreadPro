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
			System.out.println("�߳�B�� run end����ӡ��");
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			System.out.println("�߳�B��catch����ӡ��");
			e.printStackTrace();
		}
	}
}
