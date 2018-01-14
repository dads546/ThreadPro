package ReentrantLockFair;

/**
 * ReentrantLock(true) ���ռ���˳�������
 * 
 * ÿ���߳��ڻ�ȡ��ʱ���Ȳ鿴����ά���ĵȴ�����
 * �����Ϊ�գ����ߵ�ǰ�߳��߳��ǵȴ����еĵ�һ����
 * ��ռ����������ͻ���뵽�ȴ������У��Ժ�ᰴ��
 * FIFO�Ĺ���Ӷ�����ȡ���Լ�
 * 
 * �ɿ��ƻ��ѵ�˳��(��ο��ƿ�ʼ˳��setPriority���� ��������ȷ�ķ�ʽ???)
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
					System.out.println(Thread.currentThread().getName()+"��ʼ����");
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
