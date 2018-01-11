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
					System.out.println(Thread.currentThread().getName()+"������");
					lock.wait();
				}
				System.out.println(Thread.currentThread().getName()+"�����˲�Ʒ");
				ValueObject.value = System.currentTimeMillis()+Thread.currentThread().getName();
				lock.notify();
			}
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
