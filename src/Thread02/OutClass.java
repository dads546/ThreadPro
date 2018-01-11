package Thread02;

public class OutClass {
	static class InnerClass1{
		public void method1(InnerClass2 ic2) {
			String threadName = Thread.currentThread().getName();
			synchronized (ic2) {
				System.out.println(threadName+"进入InnerClass1中的method1方法");
				for(int i=0;i<10;i++) {
					System.out.println("i="+i);
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
				System.out.println(threadName+"离开InnerClass1的method1方法");
			}
		}
		
		synchronized public void method2() {
			String threadName = Thread.currentThread().getName();
			System.out.println(threadName+"进入InnerClass1中的method2方法");
			for(int j=0;j<10;j++) {
				System.out.println("j="+j);
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			System.out.println(threadName+"离开InnerClass1的method2方法");
		}
		
	}

	static class InnerClass2{
		synchronized public void method1() {
			String threadName = Thread.currentThread().getName();
			System.out.println(threadName+"进入InnerClass2中的method1方法");
			for(int k=0;k<10;k++) {
				System.out.println("k="+k);
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			System.out.println(threadName+"离开InnerClass2的method1方法");
		}
		
	}
}
