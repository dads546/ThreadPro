package ManyProvider2ManyConsumerVal;

/**
 *  多生产者多消费者模式。为什么实体中if条件换成了while呢
 *  当单个生产者单个消费者时.线程运行到if条件暂停。释放锁
 *  被唤醒后接着if运行 所以不会有问题。
 *  但多个生产者多个消费者的情况下,如果生产者检验到库存中有货就wait释放锁
 *  notify唤醒的可能是消费者 可能是生产者，如果是生产者。他if判断条件为假
 *  (因为前一个生产者生产了)所以他本该wait但因为使用If 条件为假接着向下执行
 *  会继续执行接下来的语句
 *  
 *  所以用if永远不会假死 因为Notify在else的部分一定会执行
 *  
 *  
 * 解决办法 notify改变为notifyall
 * @author songxilong
 *
 */
public class Run {
	
	public static void main(String[] args) {
		String lock = "sxl";
		P p = new P(lock);
		C c = new C(lock);
		ThreadP tp1 = new ThreadP(p);
		ThreadC tc1 = new ThreadC(c);
		
		ThreadP tp2 = new ThreadP(p);
		ThreadC tc2 = new ThreadC(c);
		tp1.setName("生产者1");
		tc1.setName("消费者1");
		
		tp2.setName("生产者2");
		tc2.setName("消费者2");
		
		tp1.start();
		tc1.start();
		
		tp2.start();
		tc2.start();
	}
}
