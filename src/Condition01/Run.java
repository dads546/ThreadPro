package Condition01;

/**
 * run方法 中调用await
 * 没有锁对象 所以报错
 * 
 * 改为weitMethod打印了locked但不会Unlock
 * 进入waiting状态无人唤醒
 * 
 * 进行await方法前一定要得到锁对象(wait()方法要再synchronized方法中调用)
 * @author songxilong
 *
 */
public class Run {
	public static void main(String[] args) {
		try {
			MyService service = new MyService();
			ThreadA a = new ThreadA(service);
			a.start();
			Thread.sleep(1000);
			ThreadB b = new ThreadB(service);
			b.start();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
