package LockMethodTest;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

/**
 * 返回当前线程调用lock.lock()的次数
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
	private ReentrantLock lock = new ReentrantLock();
	private Condition c = lock.newCondition();
	public void method1() {
		lock.lock();
		lock.lock();
		try {
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
			System.out.println("wait后被唤醒了");
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
}