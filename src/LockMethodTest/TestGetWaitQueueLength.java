package LockMethodTest;

/**
 * 返回调用了condition的await并且没有被signal的线程数
 * 
 * 调用signalAll后返回0
 * @author songxilong
 *
 */
public class TestGetWaitQueueLength {
	public static void main(String[] args) {
		Service service = new Service();
		Runnable r= new Runnable() {
			
			@Override
			public void run() {
				service.awaitMethod();
			}
		};
		for(int i=0;i<10;i++) {
			Thread t = new Thread(r);
			t.start();
		}
		try {
			Thread.sleep(1000);
			System.out.println("调用了await的数量为"+service.getWaitQueueLength());
			System.out.println("请求lock的数量为"+service.getQueueLength());
			service.signalAll();
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("请求lock的数量为"+service.getQueueLength());
		System.out.println("调用了await的数量为"+service.getWaitQueueLength());
	}
}
