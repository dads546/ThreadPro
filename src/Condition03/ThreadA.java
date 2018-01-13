package Condition03;

public class ThreadA extends Thread{
	private MyService myService;

	public ThreadA(MyService myService) {
		super();
		this.myService = myService;
	}
	
	public void run() {
		// TODO Auto-generated method stub
		myService.awaitA();
	}
}
