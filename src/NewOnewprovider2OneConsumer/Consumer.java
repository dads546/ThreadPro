package NewOnewprovider2OneConsumer;

public class Consumer extends Thread {
	private MyService myService;

	public Consumer(MyService myService) {
		super();
		this.myService = myService;
	}
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		super.run();
		while(true)
			myService.getValue();
	}
}
