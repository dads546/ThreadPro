package NewOnewprovider2OneConsumer;

public class Provider extends Thread{

	private MyService myService;

	public Provider(MyService myService) {
		super();
		this.myService = myService;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		super.run();
		while(true)
			myService.setValue();
	}
	
}
