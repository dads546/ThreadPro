package OneProvider2OneConsumerStack;

/**
 * 多生产者下如果生产者生产后notify了另一阻塞生产者线程
 * 该唤醒线程会继续添加元素之后生产者list size会超过1便会执行下去。
 * 不过每次执行后都存在notify故可能给其他线程执行的机会
 * 疑问:后面好像notify后总是当前线程又获得锁？
 * 
 * 判断while notify->notifyAll
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
		tp1.setName("生产者1");
		tp2.setName("生产者2");
		tc.setName("消费者");
		tp1.start();
		tp2.start();
		tc.start();
	}
}
