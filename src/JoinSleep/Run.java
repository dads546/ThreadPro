package JoinSleep;


/**
 * 先开启a线程  同步方法占用锁对象b
 * 睡眠5s main线程在睡眠1S后启动c线程
 * c线程执行b的同步方法。
 * 无法执行,因为a中sleep仍然占有着锁对象b
 * 
 * 将sleep改为join后.b释放了锁对象。所以c中的同步方法得到锁 可以执行
 * 
 * 
 * ????join时间2s join结束后 main调用同步方法依然可以获得锁
 * @author songxilong
 *
 */
public class Run {
	public static void main(String[] args) {
		try {
			ThreadB b = new ThreadB();
			ThreadC c = new ThreadC(b);
			ThreadA a = new ThreadA(b);
			a.start();
			Thread.sleep(3000);
			c.start();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
