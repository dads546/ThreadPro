package ManyProvider2ManyConsumerVal;

public class P {
	private String lock;

	public P(String lock) {
		super();
		this.lock = lock;
	}
	
	public void getValue() {
		try {
			synchronized (lock) {
				while (!ValueObject.value.equals("")) {
					System.out.println(Thread.currentThread().getName()+"waiting了");
					lock.wait();
				}
				System.out.println(Thread.currentThread().getName()+"runnable");
				ValueObject.value = System.currentTimeMillis()+Thread.currentThread().getName();
				System.out.println("---------------------------生产者生产中");
				lock.notify();
			}
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
