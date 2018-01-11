package OneProvider2OneConsumerVal;

public class P {
	private String lock;

	public P(String lock) {
		super();
		this.lock = lock;
	}
	
	public void getValue() {
		try {
			synchronized (lock) {
				if (!ValueObject.value.equals("")) {
					System.out.println(Thread.currentThread().getName()+"阻塞了");
					lock.wait();
				}
				System.out.println(Thread.currentThread().getName()+"生产了产品");
				ValueObject.value = System.currentTimeMillis()+Thread.currentThread().getName();
				lock.notify();
			}
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
