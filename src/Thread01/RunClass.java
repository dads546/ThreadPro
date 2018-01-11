package Thread01;

public class RunClass {

	public static void main(String[] args) {
		MyThread mt = new MyThread();
		mt.start();
		try {
			Thread.sleep(5);
			mt.interrupt();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
