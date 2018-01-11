package OneProvider2OneConsumerStack;


/**
 * 一个生产者 多消费者时出现报错
 * 因为消费者Notify了消费者。notify的消费者继续执行if语句外的remove操作故会报错
 * 将if改为while 每次开始都会判断条件则解决该问题
 * 但出现了假死问题。
 * 再将Notify改为NotifyAll
 * 程序正常运行
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
		tp.setName("生产者");
		tc1.setName("消费者1");
		tc2.setName("消费者2");
		tp.start();
		tc1.start();
		tc2.start();
	}

}
