package ReentrantLock02;

public class MyThreadB extends Thread {
	private MyService myservice;

	public MyThreadB(MyService myservice) {
		super();
		this.myservice = myservice;
	}
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		super.run();
		myservice.methodB();
	}
}
