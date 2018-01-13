package Condition03;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class MyService {
	private Lock lock = new ReentrantLock();
	private Condition condition = lock.newCondition();
	
	public void awaitA() {
		try {
			lock.lock();
			System.out.println("waitA start:"+System.currentTimeMillis());
			condition.await();
			Thread.sleep(1000);
			System.out.println("waitA end:"+System.currentTimeMillis());
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			lock.unlock();
		}
		
	}
	
	public void awaitB() {
		try {
			lock.lock();
			System.out.println("waitB start:"+System.currentTimeMillis());
			condition.await();
			Thread.sleep(1000);
			System.out.println("waitB end:"+System.currentTimeMillis());
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			lock.unlock();
		}
	}
	
	public void signalAll() {
		try {
			lock.lock();
			condition.signalAll();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			lock.unlock();
		}
	}
}
