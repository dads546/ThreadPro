package Thread01;

public class MyThread extends Thread {
	@Override
	public void run() {
			try {
				for(int i=0;i<50000;i++) {
					System.out.println(i);
					if(this.isInterrupted())
					{
						throw new InterruptedException();
					}
				}
				System.out.println("��ֹ֮����ȴ������");
			} catch (InterruptedException e) {
				System.out.println("�쳣ֹͣ�߳�for�ⲿ�������С��ɹ�");
			}
	}
}
