package OneProvider2OneConsumerVal;

/**
 * 单生产者单 消费者模式 
 *  需要注意的是 通过wilie(true)去生产(消费)产品某次循环中调用Notify()并不会马上释放锁,要等待while执行到wait()后
 *  这里不清楚的一点是同步的是setValue()方法,为什么当次执行完后还会执行一次循环体到wait()
 * @author songxilong
 *
 */
public class Run {
	
	public static void main(String[] args) {
		String lock = "sxl";
		P p = new P(lock);
		C c = new C(lock);
		ThreadP tp = new ThreadP(p);
		ThreadC tc = new ThreadC(c);
		tp.setName("生产者");
		tc.setName("消费者");
		tp.start();
		tc.start();
	}

}
