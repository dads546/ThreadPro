package Thread01;

public class RunClass3 {
		public static void main(String[] args) {
			SleepThread st = new SleepThread();
			st.start();
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			st.interrupt();
		}


}
