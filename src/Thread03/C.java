package Thread03;

/**
 * 消费者线程 ,工厂中存在商品时去消费。
 * @author songxilong
 *
 */
public class C implements Runnable{
	private String lock;

	public C(String lock) {
		super();
		this.lock = lock;
	}
	
	public void getValue() {
		try {
			synchronized (lock) {
				//无库存 等待商家
				while(Factory.size == 0)
				{
					System.out.println(Thread.currentThread().getName()+"进入等待");					
					lock.wait();
				}
				//消费商品,消耗库存
				System.out.println(Thread.currentThread().getName()+"消费商品标号为:"+Factory.size);
				Factory.size = 0;
				//唤醒商家
				lock.notify();
			}
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	@Override
	public void run() {
		while(!Thread.currentThread().isInterrupted())
			getValue();
	}
}
