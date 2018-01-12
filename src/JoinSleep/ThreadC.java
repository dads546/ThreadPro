package JoinSleep;

public class ThreadC extends Thread {
		ThreadB b ;

		public ThreadC(ThreadB b) {
			super();
			this.b = b;
		}
		@Override
		public void run() {
			// TODO Auto-generated method stub
			super.run();
			b.bService();
		}
}
