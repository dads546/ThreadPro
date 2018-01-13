package Condition03;

public class ThreadB extends Thread{
	private MyService myService;

	public ThreadB(MyService myService) {
		super();
		this.myService = myService;
	}
	
	public void run() {
		// TODO Auto-generated method stub
		myService.awaitB();
	}
}
