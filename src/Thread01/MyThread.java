package Thread01;

public class MyThread extends Thread {
	@Override
	public void run() {
			try {
				for(int i=0;i<50000;i++) {
					System.out.println(i);
					if(this.isInterrupted())
					{
						throw new InterruptedException();
					}
				}
				System.out.println("终止之后我却运行了");
			} catch (InterruptedException e) {
				System.out.println("异常停止线程for外部不在运行。成功");
			}
	}
}
