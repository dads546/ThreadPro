package ReentrantLockFair;

/**
 * ReentrantLock(true) 按照加锁顺序分配锁
 * 
 * 每个线程在获取锁时会先查看此锁维护的等待队列
 * ，如果为空，或者当前线程线程是等待队列的第一个，
 * 就占有锁，否则就会加入到等待队列中，以后会按照
 * FIFO的规则从队列中取到自己
 * 
 * 可控制唤醒的顺序(如何控制开始顺序？setPriority或者 其他更精确的方式???)
 * @author songxilong
 *
 */
public class Run {
	public static void main(String[] args) {
		final MyService ms = new MyService(false);
		Runnable r = new Runnable() {
			
			@Override
			public void run() {
				try {
					System.out.println(Thread.currentThread().getName()+"开始运行");
//					Thread.sleep(1000);
					// TODO Auto-generated method stub
					ms.service();
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		};
		
		for(int i=0;i<10;i++) {
			Thread t = new Thread(r,i+"");
			t.start();
		}
		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		for(int i=0;i<10;i++) {
			ms.signal();
		}
	}
}
