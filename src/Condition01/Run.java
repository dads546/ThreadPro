package Condition01;

/**
 * run���� �е���await
 * û�������� ���Ա���
 * 
 * ��ΪweitMethod��ӡ��locked������Unlock
 * ����waiting״̬���˻���
 * 
 * ����await����ǰһ��Ҫ�õ�������(wait()����Ҫ��synchronized�����е���)
 * @author songxilong
 *
 */
public class Run {
	public static void main(String[] args) {
		try {
			MyService service = new MyService();
			ThreadA a = new ThreadA(service);
			a.start();
			Thread.sleep(1000);
			ThreadB b = new ThreadB(service);
			b.start();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
