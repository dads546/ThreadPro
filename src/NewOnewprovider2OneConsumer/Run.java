package NewOnewprovider2OneConsumer;

/**
 * ͨ��lock �� condition����synchronized��wait notifʵ��һ������һ������
 * @author songxilong
 *
 */
public class Run {
	public static void main(String[] args) {
		MyService ms = new MyService();
		Provider p = new Provider(ms);
		p.setName("������");
		Thread  c =   new Consumer(ms);
		c.setName("������");
		c.start();
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		p.start();
	}
}
