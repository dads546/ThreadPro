package Thread03;

import java.util.Random;



public class P implements Runnable{
	private String lock;

	public P(String lock) {
		super();
		this.lock = lock;
	}
	
	public void setValue() {
		try {
			synchronized (lock) {
				//�Ѿ����ڿ�� �ȴ�����
				while(Factory.size!=0) {
					System.out.println(Thread.currentThread().getName()+"����ȴ�");
					lock.wait();
				}
				//������Ʒ
				int value = new Random().nextInt(10)+1;
				System.out.println(Thread.currentThread().getName()+"������Ʒ���Ϊ:"+value);
				Thread.sleep(1000);
				Factory.size =value;
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
			setValue();
	}

}
