package ReentrantLock02;

public class MyThreadA extends Thread {
	private MyService myservice;

	public MyThreadA(MyService myservice) {
		super();
		this.myservice = myservice;
	}
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		super.run();
		myservice.methodA();
	}
}
