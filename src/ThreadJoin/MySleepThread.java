package ThreadJoin;

public class MySleepThread extends Thread{
	@Override
	public void run() {
		// TODO Auto-generated method stub
		super.run();
		try {
			System.out.println("begin time = "+System.currentTimeMillis());
			Thread.sleep(5000);
			System.out.println("mt end");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
