package Thread03;

public class Run {
	public static void main(String[] args) {
		String lock = "sxl";
		Thread tc1 = new Thread(new C(lock),"消费者1");
//		Thread tc2 = new Thread(new C(lock),"消费者2");
		
		Thread tp1 = new Thread(new P(lock),"生产者1");
		Thread tp2 = new Thread(new P(lock),"生产者2");
		tc1.start();
//		tc2.start();
		
		tp1.start();
		tp2.start();
		
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
//		
//		tc1.interrupt();
//		tc2.interrupt();
	}
}
