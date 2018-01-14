package LockMethodTest;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * ���ص�ǰ�̵߳���lock.lock()�Ĵ���
 * 
 * @author songxilong
 *
 */
public class TestGetHoldCount {
		public static void main(String[] args) {
			Service service = new Service();
			service.method1();
			System.out.println(service.getHoldCount());
			service.method2();
			System.out.println(service.getHoldCount());
		}
}
class Service{
	public static ReentrantLock lock = new ReentrantLock();
	public static Condition c = lock.newCondition();
	public void method1() {
		try {
			lock.lock();
			Thread.sleep(Integer.MAX_VALUE);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			lock.unlock();
		}
	}
	
	public void awaitMethod() {
		try {
			lock.lock();
			c.await();
			System.out.println("wait�󱻻�����");
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
			c.signalAll();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			lock.unlock();
		}
	}
	public void method2() {
		try {
			lock.lock();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			lock.unlock();
		}
	}
	public int getHoldCount() {
		return lock.getHoldCount();
	}
	public int getQueueLength() {
		return lock.getQueueLength();
	}
	public int getWaitQueueLength() {
		int result=0;
		try {
			lock.lock();
			result = lock.getWaitQueueLength(c);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			lock.unlock();
		}
		return result;
	}
	
	public Lock getLock() {
		return this.lock;
	}

	public boolean hasWaiters() {
		lock.lock();
		// TODO Auto-generated method stub
		return lock.hasWaiters(c);
	}
}