package NewOnewprovider2OneConsumer;

/**
 * ͬ���ڶ����Ѷ������ߵ�����³����˼���
 * ����취һ
 * 		signal -> signalAll
 * 		���Խ����signalAll��Ȼ��֪��������Щ�߳�
 * ����취��
 * 		myservice ʹ������condition conditionC(������) conditionP(������)
 *		������Ʒ�����P��signal ������Ʒ�����C��signal
 * @author songxilong
 *
 */
public class Run2 {
	public static void main(String[] args) {
		MyService ms = new MyService();
		Provider p1 = new Provider(ms);
		p1.setName("������1");
		
		Provider p2 = new Provider(ms);
		p2.setName("������2");
		Thread  c1 =   new Consumer(ms);
		c1.setName("������1");
		
		Thread  c2 =   new Consumer(ms);
		c2.setName("������2");
		c1.start();
		c2.start();
		p1.start();
		p2.start();
	}
}
