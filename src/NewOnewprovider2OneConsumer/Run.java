package NewOnewprovider2OneConsumer;

/**
 * 通过lock 和 condition代替synchronized和wait notif实现一生产者一消费者
 * @author songxilong
 *
 */
public class Run {
	public static void main(String[] args) {
		MyService ms = new MyService();
		Provider p = new Provider(ms);
		p.setName("生产者");
		Thread  c =   new Consumer(ms);
		c.setName("消费者");
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
