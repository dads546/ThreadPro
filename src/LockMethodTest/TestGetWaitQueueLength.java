package LockMethodTest;

/**
 * ���ص�����condition��await����û�б�signal���߳���
 * 
 * ����signalAll�󷵻�0
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
			System.out.println("������await������Ϊ"+service.getWaitQueueLength());
			System.out.println("����lock������Ϊ"+service.getQueueLength());
			service.signalAll();
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("����lock������Ϊ"+service.getQueueLength());
		System.out.println("������await������Ϊ"+service.getWaitQueueLength());
	}
}
