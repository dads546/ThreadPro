package Thread02;

import Thread02.OutClass.InnerClass1;
import Thread02.OutClass.InnerClass2;

/**
 * �Ծ�̬�ڲ��������󡣸þ�̬�ڲ����е�ͬ����������ͬ����ͬ���ķ�ʽ���е���
 * @author songxilong
 *
 */
public class Run {
	public static void main(String[] args) {
		InnerClass1 in1 = new InnerClass1();
		InnerClass2 in2 = new InnerClass2();
		Thread t1 = new Thread(new Runnable() {
			@Override
			public void run() {
				in1.method1(in2);
			}
		},"t1");
		
		Thread t2 = new Thread(new Runnable() {
			@Override
			public void run() {
				in1.method2();
			}
		},"t2");
		
		Thread t3 = new Thread(new Runnable() {
			
			@Override
			public void run() {
				in2.method1();
			}
		},"t3");
		
		
		t3.start();
		t2.start();
		t1.start();
	}

}
