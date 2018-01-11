package Thread02;

public class Run02 {
	public static void main(String[] args) {
		PrintString ps = new PrintString();
		Thread thread = new Thread(ps);
		thread.start();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		ps.setContinuePrint(false);
	}

}
