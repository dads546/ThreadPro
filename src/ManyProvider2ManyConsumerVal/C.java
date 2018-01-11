package ManyProvider2ManyConsumerVal;

public class C {
	private String lock;

	public C(String lock) {
		super();
		this.lock = lock;
	}

	public void setValue() {
		try {
			synchronized (lock) {
				while (ValueObject.value.equals("")) {
					System.out.println(Thread.currentThread().getName()+"waiting��");
					lock.wait();
				}
				System.out.println(Thread.currentThread().getName()+"runnable");
				ValueObject.value = "";
				System.out.println("------------------------������������");
				lock.notify();
			}
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
