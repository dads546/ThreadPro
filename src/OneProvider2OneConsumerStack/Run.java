package OneProvider2OneConsumerStack;

/**
 * �������ߵ� ������ģʽ 
 *  ��Ҫע����� ͨ��wilie(true)ȥ����(����)��Ʒĳ��ѭ���е���Notify()�����������ͷ���,Ҫ�ȴ�whileִ�е�wait()��
 *  ���ﲻ�����һ����ͬ������setValue()����,Ϊʲô����ִ����󻹻�ִ��һ��ѭ���嵽wait()
 * @author songxilong
 *
 */
public class Run {
	
	public static void main(String[] args) {
		MyStack ms = new MyStack();
		P p = new P(ms);
		C c = new C(ms);
		ThreadP tp = new ThreadP(p);
		ThreadC tc = new ThreadC(c);
		tp.setName("������");
		tc.setName("������");
		tp.start();
		tc.start();
	}

}
