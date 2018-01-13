package ReentrantLock02;

import java.util.concurrent.locks.ReentrantLock;

public class MyService {
	private ReentrantLock lock = new ReentrantLock();

	public void methodA() {
		try {
			lock.lock();
			System.out.println("mehtodA begin threadName="+Thread.currentThread().getName()
					+"time="+System.currentTimeMillis());
			Thread.sleep(5000);
			System.out.println("mehtodA end threadName="+Thread.currentThread().getName()
					+"time="+System.currentTimeMillis());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			lock.unlock();
		}
	}
	
	public void methodB() {
		try {
			lock.lock();
			System.out.println("mehtodB begin threadName="+Thread.currentThread().getName()
					+"time="+System.currentTimeMillis());
			Thread.sleep(5000);
			System.out.println("mehtodB end threadName="+Thread.currentThread().getName()
					+"time="+System.currentTimeMillis());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			lock.unlock();
		}
	}
}
