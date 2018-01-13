package Condition04;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class MyService {
	private Lock lock = new ReentrantLock();
	private Condition conditionA = lock.newCondition();
	private Condition conditionB = lock.newCondition();
	public void awaitA() {
		try {
			lock.lock();
			System.out.println("awaitA begin "+System.currentTimeMillis());
			conditionA.await();
			System.out.println("awaitA end "+System.currentTimeMillis());
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
			System.out.println("awaitBbegin "+System.currentTimeMillis());
			conditionB.await();
			System.out.println("awaitB end "+System.currentTimeMillis());
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			lock.unlock();
		}
	}
	public void signalA() {
		try {
			lock.lock();
			System.out.println("signalA"+System.currentTimeMillis());
			conditionA.signal();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			lock.unlock();
		}
	}
	
	public void signalB() {
		try {
			lock.lock();
			System.out.println("signalB"+System.currentTimeMillis());
			conditionB.signal();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			lock.unlock();
		}
	}
}
