package JoinException;


/**
 * 新建ThreadB b中执行ThreadA.
 * 并将a join到b中 
 * 启动线程C c中调用b的interrupt方法
 * b中打印异常
 * 
 * 相当于b线程运行中join了a .然后调用了b的interrupt
 * Error
 * 但A仍在运行
 * @author songxilong
 *
 */
public class Run {

	public static void main(String[] args) {
		try {
			ThreadB b = new ThreadB();
			b.start();
			Thread.sleep(500);
			ThreadC c = new ThreadC(b);
			c.start();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
