package Condition04;

public class Run {
	public static void main(String[] args) {
		try {
			MyService ms=  new MyService();
			ThreadTest a1 = new ThreadTest(ms, 0, "A");
			ThreadTest b1 = new ThreadTest(ms, 0, "B");
			ThreadTest a2 = new ThreadTest(ms, 1, "A");
			ThreadTest b2 = new ThreadTest(ms, 1, "B");
			
			a1.start();
			b1.start();
			
			Thread.sleep(1200);
			a2.start();
			
			
			b2.start();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
