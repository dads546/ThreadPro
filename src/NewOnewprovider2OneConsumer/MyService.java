package NewOnewprovider2OneConsumer;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class MyService {
	private int size = 0;//模拟工厂中数量
	private Lock lock = new ReentrantLock();
	private Condition conditionC = lock.newCondition();
	private Condition conditionP = lock.newCondition();
	public void setValue() {
		try {
			lock.lock();
			while(size == 1)
			{
				System.out.println(Thread.currentThread().getName()+"进入等待");				
				conditionP.await();
			}
			System.out.println(Thread.currentThread().getName()+"生产了商品");
			size++;
			conditionC.signal();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			lock.unlock();
		}
	}
	
	public void getValue() {
		try {
			lock.lock();
			while(size == 0)
			{
				System.out.println(Thread.currentThread().getName()+"进入等待");
				conditionC.await();
			}
			System.out.println(Thread.currentThread().getName()+"消费了商品");
			size--;
			conditionP.signal();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			lock.unlock();
		}
	}
}
