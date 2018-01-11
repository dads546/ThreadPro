package OneProvider2OneConsumerStack;

import java.util.ArrayList;
import java.util.List;

public class MyStack {
	
	volatile private List list = new ArrayList();
	
	synchronized public void push() {
		try {
			while(this.list.size() == 1)
				this.wait();
			System.out.println(Thread.currentThread().getName()+"被唤醒");
			list.add("anything="+Math.random());
			this.notifyAll();
			System.out.println("push="+list.size());
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	synchronized public String pop() {
		String returnValue = "";
		try {
			while(list.size() == 0) {
				System.out.println("pop操作"+Thread.currentThread().getName()+"线程wait");
				this.wait();
			}
			returnValue = ""+list.get(0);
			list.remove(0);
			this.notify();
			System.out.println("pop="+list.size());
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return returnValue;
	}

}
