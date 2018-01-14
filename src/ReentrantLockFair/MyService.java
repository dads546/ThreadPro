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
//			System.out.println(Thread.currentThread().getName()+"lockǰ"+lock.getQueueLength());
			lock.lock();
			c.await();
//			System.out.println(Thread.currentThread().getName()+"lock��"+lock.getQueueLength());
			System.out.println(Thread.currentThread().getName()+"�����");
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
