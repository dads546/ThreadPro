package OneProvider2OneConsumerStack;

public class ThreadC extends Thread{
	private C c;

	public ThreadC(C c) {
		this.c = c;
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		super.run();
		while(true)
			c.popService();
	}
}
