package OneProvider2OneConsumerStack;


/**
 * һ�������� ��������ʱ���ֱ���
 * ��Ϊ������Notify�������ߡ�notify�������߼���ִ��if������remove�����ʻᱨ��
 * ��if��Ϊwhile ÿ�ο�ʼ�����ж���������������
 * �������˼������⡣
 * �ٽ�Notify��ΪNotifyAll
 * ������������
 * @author songxilong
 *
 */
public class Run2 {
	public static void main(String[] args) {
		MyStack ms = new MyStack();
		P p = new P(ms);
		C c1 = new C(ms);
		C c2 = new C(ms);
		ThreadP tp = new ThreadP(p);
		ThreadC tc1 = new ThreadC(c1);
		ThreadC tc2 = new ThreadC(c2);
		tp.setName("������");
		tc1.setName("������1");
		tc2.setName("������2");
		tp.start();
		tc1.start();
		tc2.start();
	}

}
