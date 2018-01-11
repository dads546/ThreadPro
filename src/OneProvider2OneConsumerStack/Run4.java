package OneProvider2OneConsumerStack;

/**
 * ������������
 * @author songxilong
 *
 */
public class Run4 {
	
	public static void main(String[] args) {
		MyStack ms = new MyStack();
		P p1 = new P(ms);
		P p2 = new P(ms);
		C c1 = new C(ms);
		C c2 = new C(ms);
		ThreadP tp1 = new ThreadP(p1);
		ThreadP tp2 = new ThreadP(p2);
		ThreadC tc1 = new ThreadC(c1);
		ThreadC tc2 = new ThreadC(c2);
		tp1.setName("������1");
		tp2.setName("������2");
		tc1.setName("������1");
		tc2.setName("������2");
		tp1.start();
		tp2.start();
		tc1.start();
		tc2.start();
	}

}
