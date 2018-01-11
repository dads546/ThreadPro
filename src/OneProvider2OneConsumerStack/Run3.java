package OneProvider2OneConsumerStack;

/**
 * �������������������������notify����һ�����������߳�
 * �û����̻߳�������Ԫ��֮��������list size�ᳬ��1���ִ����ȥ��
 * ����ÿ��ִ�к󶼴���notify�ʿ��ܸ������߳�ִ�еĻ���
 * ����:�������notify�����ǵ�ǰ�߳��ֻ������
 * 
 * �ж�while notify->notifyAll
 * @author songxilong
 *
 */
public class Run3 {
	public static void main(String[] args) {
		MyStack ms = new MyStack();
		P p1 = new P(ms);
		P p2 = new P(ms);
		C c = new C(ms);
		ThreadP tp1 = new ThreadP(p1);
		ThreadP tp2 = new ThreadP(p2);
		ThreadC tc = new ThreadC(c);
		tp1.setName("������1");
		tp2.setName("������2");
		tc.setName("������");
		tp1.start();
		tp2.start();
		tc.start();
	}
}
