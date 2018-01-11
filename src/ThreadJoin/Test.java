package ThreadJoin;

/**
 * MyThread线程随机睡眠一段时间。想在test中等mt执行完后
 * 接着运行主线程，但不清楚mt的执行时间，无法用sleep 
 * 解决办法
 * mt.join
 * @author songxilong
 *
 */
public class Test {
	public static void main(String[] args) {
		MyThread mt = new MyThread();
		mt.start();
		try {
			mt.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("myThread执行后我才打印");
	}

}
