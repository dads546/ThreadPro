package ThreadJoin;

/**
 * MyThread�߳����˯��һ��ʱ�䡣����test�е�mtִ�����
 * �����������̣߳��������mt��ִ��ʱ�䣬�޷���sleep 
 * ����취
 * mt.join
 * @author songxilong
 *
 */
public class Test {
	public static void main(String[] args) {
		MyThread mt = new MyThread();
		mt.start();
		try {
			mt.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("myThreadִ�к��ҲŴ�ӡ");
	}

}
