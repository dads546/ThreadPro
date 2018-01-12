package ThreadJoin;

/**
 * join�ȵõ���
 * 
 * a,b�߳̿���run����b��
 * b.join����b��
 * b���ߵõ���, �ͷ��� ����wait  timeʱ��
 * ִ���걾��ͬ���������ͷ���,ʣ�µĶ����Join������
 *    1.ʣ�µĶ���õ���.��ִ�б����ͷ���join�õ���ʱ���ѹ� ִ��main
 * 	  2.join�õ��� ����ʱ���ѹ��ͷ�����ִ��main
 * 
 * 
 * join����Ҳ�Ὰ������������
 * @author songxilong
 *
 */
public class Run {
	public static void main(String[] args) {
		try {
			ThreadB b = new ThreadB();
			ThreadA a = new ThreadA(b);
			a.start();
			b.start();
			b.join(8000);
			System.out.println("main end"+System.currentTimeMillis());
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
