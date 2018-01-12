package ThreadJoin;

/**
 * 
 * join(time) 主线程等待加入线程执行time时间再执行本身
 * 
 * join 方法释放锁 sleep并不释放锁
 * 在这里可以看到 使用sleep等待6s和使用Join 6s效果相同
 * 但 sleep只是主线程在睡眠。main线程拥有自己的锁
 * 使用Join后(方法内由wait实现)可能存在共享锁(猜想)
 * @author songxilong
 *
 */
public class Test1 {
	public static void main(String[] args) {
		try {
			MySleepThread mt = new MySleepThread();
			mt.start();
			mt.join(3000);
			//Thread.sleep(6000);
			System.out.println("end time "+System.currentTimeMillis());
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
