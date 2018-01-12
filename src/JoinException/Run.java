package JoinException;


/**
 * �½�ThreadB b��ִ��ThreadA.
 * ����a join��b�� 
 * �����߳�C c�е���b��interrupt����
 * b�д�ӡ�쳣
 * 
 * �൱��b�߳�������join��a .Ȼ�������b��interrupt
 * Error
 * ��A��������
 * @author songxilong
 *
 */
public class Run {

	public static void main(String[] args) {
		try {
			ThreadB b = new ThreadB();
			b.start();
			Thread.sleep(500);
			ThreadC c = new ThreadC(b);
			c.start();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
