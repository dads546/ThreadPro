package NewOnewprovider2OneConsumer;

/**
 * 同样在多消费多生产者的情况下出现了假死
 * 解决办法一
 * 		signal -> signalAll
 * 		可以解决但signalAll仍然不知道唤醒哪些线程
 * 解决办法二
 * 		myservice 使用两个condition conditionC(消费者) conditionP(生产者)
 *		生产商品后调用P锁signal 消费商品后调用C锁signal
 * @author songxilong
 *
 */
public class Run2 {
	public static void main(String[] args) {
		MyService ms = new MyService();
		Provider p1 = new Provider(ms);
		p1.setName("生产者1");
		
		Provider p2 = new Provider(ms);
		p2.setName("生产者2");
		Thread  c1 =   new Consumer(ms);
		c1.setName("消费者1");
		
		Thread  c2 =   new Consumer(ms);
		c2.setName("消费者2");
		c1.start();
		c2.start();
		p1.start();
		p2.start();
	}
}
