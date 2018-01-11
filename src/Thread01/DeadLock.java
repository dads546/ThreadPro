package Thread01;

public class DeadLock {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

class RequiredA extends Thread{
	int a;
	int b;
	public RequiredA(int a,int b) {
		this.a = a;
		this.b = b;
	}
	@Override
    public void run() {
		
	}
}

class RequiredB extends Thread{
	int a;
	int b;
	public RequiredB(int a,int b) {
		this.a = a;
		this.b = b;
	}
	synchronized public void run() {
		
	}
}
