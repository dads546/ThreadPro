package ReentrantLockFair;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

public class MyService {
	private ReentrantLock lock;
	private Condition c;
	public MyService(boolean isFair) {
		super();
		this.lock = new ReentrantLock(isFair);
		c = lock.newCondition();
	}
	
	public void service() {
		try {
//			System.out.println(Thread.currentThread().getName()+"lock前"+lock.getQueueLength());
			lock.lock();
			c.await();
//			System.out.println(Thread.currentThread().getName()+"lock后"+lock.getQueueLength());
			System.out.println(Thread.currentThread().getName()+"获得锁");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			lock.unlock();
		}
	}
	
	public void signal() {
		try {
			lock.lock();
			c.signal();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			lock.unlock();
		}
	}
}
