package Condition02;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class MyService {
	private Lock lock = new ReentrantLock();
	private Condition condition = lock.newCondition();
	
	public void await() {
		try {
			lock.lock();
			System.out.println("await ¿ªÊ¼"+System.currentTimeMillis());
			condition.await();
			System.out.println("await ½áÊø"+System.currentTimeMillis());
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void signal() {
		try {
			lock.lock();
			System.out.println("signal l"+System.currentTimeMillis());
			condition.signal();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			lock.unlock();
		}
	}
}
