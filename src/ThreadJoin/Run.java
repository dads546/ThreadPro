package ThreadJoin;

/**
 * join先得到锁
 * 
 * a,b线程开启run竞争b锁
 * b.join竞争b锁
 * b或者得到锁, 释放锁 并且wait  time时长
 * 执行完本身同步方法后释放锁,剩下的对象和Join竞争锁
 *    1.剩下的对象得到锁.在执行本身释放锁join得到锁时间已过 执行main
 * 	  2.join得到锁 发现时间已过释放锁并执行main
 * 
 * 
 * join方法也会竞争对象锁本身
 * @author songxilong
 *
 */
public class Run {
	public static void main(String[] args) {
		try {
			ThreadB b = new ThreadB();
			ThreadA a = new ThreadA(b);
			a.start();
			b.start();
			b.join(8000);
			System.out.println("main end"+System.currentTimeMillis());
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
