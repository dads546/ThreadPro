package JoinException;

public class ThreadC extends Thread {
		private ThreadB threadB;
		
		
		public ThreadC(ThreadB threadB) {
			super();
			this.threadB = threadB;
		}


		@Override
		public void run() {
			// TODO Auto-generated method stub
			super.run();
			threadB.interrupt();
		}
}
