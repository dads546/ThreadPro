package NewOnewprovider2OneConsumer;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class MyService {
	private int size = 0;//ģ�⹤��������
	private Lock lock = new ReentrantLock();
	private Condition conditionC = lock.newCondition();
	private Condition conditionP = lock.newCondition();
	public void setValue() {
		try {
			lock.lock();
			while(size == 1)
			{
				System.out.println(Thread.currentThread().getName()+"����ȴ�");				
				conditionP.await();
			}
			System.out.println(Thread.currentThread().getName()+"��������Ʒ");
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
				System.out.println(Thread.currentThread().getName()+"����ȴ�");
				conditionC.await();
			}
			System.out.println(Thread.currentThread().getName()+"��������Ʒ");
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
