package OneProvider2OneConsumerVal;

public class ThreadP  extends Thread{
	private P p;
	
	public ThreadP(P p) {
		this.p = p;
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		super.run();
		while(true)
			p.getValue();
	}
}
