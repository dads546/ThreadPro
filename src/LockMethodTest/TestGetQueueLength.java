package LockMethodTest;

import java.util.concurrent.locks.ReentrantLock;

/**
 * 当前有多少线程在等待获取锁
 * @author songxilong
 *
 */
public class TestGetQueueLength {
	public static void main(String[] args) {
			Service service = new Service();
			Runnable r= new Runnable() {
				
				@Override
				public void run() {
					service.method1();
				}
			};
			for(int i=0;i<10;i++) {
				Thread t = new Thread(r);
				t.start();
			}
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println(service.getQueueLength());
		}
}