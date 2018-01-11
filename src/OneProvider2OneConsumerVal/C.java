package OneProvider2OneConsumerVal;

public class C {
	private String lock;

	public C(String lock) {
		super();
		this.lock = lock;
	}

	public void setValue() {
		try {
			synchronized (lock) {
				if (ValueObject.value.equals("")) {
					System.out.println(Thread.currentThread().getName()+"阻塞了");
					lock.wait();
				}
				System.out.println(Thread.currentThread().getName()+"消费了产品");
				ValueObject.value = "";
				lock.notify();
			}
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
