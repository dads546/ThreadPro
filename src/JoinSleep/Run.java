package JoinSleep;


/**
 * �ȿ���a�߳�  ͬ������ռ��������b
 * ˯��5s main�߳���˯��1S������c�߳�
 * c�߳�ִ��b��ͬ��������
 * �޷�ִ��,��Ϊa��sleep��Ȼռ����������b
 * 
 * ��sleep��Ϊjoin��.b�ͷ�������������c�е�ͬ�������õ��� ����ִ��
 * 
 * 
 * ????joinʱ��2s join������ main����ͬ��������Ȼ���Ի����
 * @author songxilong
 *
 */
public class Run {
	public static void main(String[] args) {
		try {
			ThreadB b = new ThreadB();
			ThreadC c = new ThreadC(b);
			ThreadA a = new ThreadA(b);
			a.start();
			Thread.sleep(3000);
			c.start();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
