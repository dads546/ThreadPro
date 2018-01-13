package Condition04;

public class ThreadTest extends Thread {
	
	private MyService ms;
	private int type;//0await 1signal
	private String name;
	
	
	public ThreadTest(MyService ms, int type, String name) {
		super();
		this.ms = ms;
		this.type = type;
		this.name = name;
	}


	@Override
	public void run() {
		// TODO Auto-generated method stub
		super.run();
		if(name=="A")
		{
			if((type&1)==0)
				ms.awaitA();
			else
				ms.signalA();
		}else {
			if((type&1)==0)
				ms.awaitB();
			else
				ms.signalB();
		}
	}

}
