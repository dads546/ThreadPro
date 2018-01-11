package Thread03;

/**
 * �������߳� ,�����д�����Ʒʱȥ���ѡ�
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
				//�޿�� �ȴ��̼�
				while(Factory.size == 0)
				{
					System.out.println(Thread.currentThread().getName()+"����ȴ�");					
					lock.wait();
				}
				//������Ʒ,���Ŀ��
				System.out.println(Thread.currentThread().getName()+"������Ʒ���Ϊ:"+Factory.size);
				Factory.size = 0;
				//�����̼�
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
