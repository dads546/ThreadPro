package Condition03;

/**
 * ���������еȴ��߳�
 * @author songxilong
 *
 */
public class Run {
	public static void main(String[] args) {
		try {
			MyService ms = new MyService();
			ThreadA a = new ThreadA(ms);
			ThreadB b = new ThreadB(ms);
			a.start();
			b.start();
			Thread.sleep(2000);
			ms.signalAll();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
