package LockMethodTest;

import java.util.concurrent.locks.ReentrantLock;


/**
 * hasQueuedThread(Thread t)�ƶ��߳��Ƿ�������lock
 * ��ӦgetQueueLength
 * hasQueuedThreads �Ƿ����߳��ڵȴ���lock
 * 
 * 
 * hasWaiters(Condition c)�Ƿ����߳��ڵȴ�����condition
 * ��ӦgetWaitQueueLength
 * @author songxilong
 *
 */
public class TestHasQueueThread {

	public static void main(String[] args) {
		final Service service = new Service();
		Runnable r1 = new Runnable() {
			@Override
			public void run() {
				service.awaitMethod();
			}
		};
		
		Runnable r2 = new Runnable() {
			@Override
			public void run() {
				service.awaitMethod();
			}
		};
		Thread t1 = new Thread(r1);
		Thread t2 = new Thread(r1);
		t1.start();
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		t2.start();
		System.out.println(service.hasWaiters());
		System.out.println(service.lock.hasQueuedThread(t1));
		System.out.println(service.lock.hasQueuedThread(t2));
		System.out.println(service.lock.hasQueuedThreads());
	}

}
