package ReentrantLock02;

/**
 * lock实现了和synchronized相同的同步效果
 * @author songxilong
 *
 */
public class Run {
	public static void main(String[] args) {
		try {
			MyService ms = new MyService();
			MyThreadA a = new MyThreadA(ms);
			a.setName("A");
			MyThreadA aa = new MyThreadA(ms);
			aa.setName("AA");
			MyThreadB b= new MyThreadB(ms);
			b.setName("B");
			MyThreadB bb = new MyThreadB(ms);
			bb.setName("BB");
			
			aa.start();
			a.start();
			
			Thread.sleep(2000);
			
			bb.start();
			b.start();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
