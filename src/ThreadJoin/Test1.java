package ThreadJoin;

/**
 * 
 * join(time) ���̵߳ȴ������߳�ִ��timeʱ����ִ�б���
 * 
 * join �����ͷ��� sleep�����ͷ���
 * ��������Կ��� ʹ��sleep�ȴ�6s��ʹ��Join 6sЧ����ͬ
 * �� sleepֻ�����߳���˯�ߡ�main�߳�ӵ���Լ�����
 * ʹ��Join��(��������waitʵ��)���ܴ��ڹ�����(����)
 * @author songxilong
 *
 */
public class Test1 {
	public static void main(String[] args) {
		try {
			MySleepThread mt = new MySleepThread();
			mt.start();
			mt.join(3000);
			//Thread.sleep(6000);
			System.out.println("end time "+System.currentTimeMillis());
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
