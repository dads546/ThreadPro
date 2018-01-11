package Thread02;

public class PrintString implements Runnable{

	private boolean isContinuePrint = true;
	
	public void setContinuePrint(boolean cp) {
		this.isContinuePrint = cp;
	}
	
	public void printString() {
		while(isContinuePrint==true) {
			System.out.println("run printStringMethod threadName"+Thread.currentThread().getName());
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	@Override
	public void run() {
		printString();
	}
		
}
