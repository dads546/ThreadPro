package ThreadLocal;

public class ThreadB  extends Thread {
	public void run() {
		// TODO Auto-generated method stub
		super.run();
		try {
			for(int i=0;i<100;i++) {
				Tools.t1.set("ThreadB"+(i+1));
				System.out.println("ThreadB get Value ="+Tools.t1.get());
				Thread.sleep(200);
			}
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
