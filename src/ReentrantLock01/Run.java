package ReentrantLock01;

/**
 * 从打印结果看出 虽然4个线程的顺序是随机的 ,但线程中的方法的执行顺序是同步的。
 * 
 * 即当一个线程执行完成全部的打印语句后,另一个线程才可以继续打印
 * 
 *相当于synchronized(共享obj)
 * @author songxilong
 *
 */
public class Run {
	public static void main(String[] args) {
		MyService myService = new MyService();
		MyThread t1 = new MyThread(myService); 
		MyThread t2 = new MyThread(myService); 
		MyThread t3 = new MyThread(myService); 
		MyThread t4 = new MyThread(myService); 
		t1.start();
		t2.start();
		t3.start();
		t4.start();
	}
}
