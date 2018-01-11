package Thread01;

public class RunClass2 {
	public static void main(String[] args) {
		System.out.println(Math.random());
		MyThread02 mt2 = new MyThread02();
		mt2.start();
		for(int i=0;i<10;i++) {
			long time = (long)Math.random()*10000;
			try {
				Thread.sleep(time);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("main"+Thread.currentThread().getName());
		}
	}
}
