package ManyProvider2ManyConsumerVal;

/**
 *  �������߶�������ģʽ��Ϊʲôʵ����if����������while��
 *  �����������ߵ���������ʱ.�߳����е�if������ͣ���ͷ���
 *  �����Ѻ����if���� ���Բ��������⡣
 *  ����������߶�������ߵ������,��������߼��鵽������л���wait�ͷ���
 *  notify���ѵĿ����������� �����������ߣ�����������ߡ���if�ж�����Ϊ��
 *  (��Ϊǰһ��������������)����������wait����Ϊʹ��If ����Ϊ�ٽ�������ִ��
 *  �����ִ�н����������
 *  
 *  ������if��Զ������� ��ΪNotify��else�Ĳ���һ����ִ��
 *  
 *  
 * ����취 notify�ı�Ϊnotifyall
 * @author songxilong
 *
 */
public class Run {
	
	public static void main(String[] args) {
		String lock = "sxl";
		P p = new P(lock);
		C c = new C(lock);
		ThreadP tp1 = new ThreadP(p);
		ThreadC tc1 = new ThreadC(c);
		
		ThreadP tp2 = new ThreadP(p);
		ThreadC tc2 = new ThreadC(c);
		tp1.setName("������1");
		tc1.setName("������1");
		
		tp2.setName("������2");
		tc2.setName("������2");
		
		tp1.start();
		tc1.start();
		
		tp2.start();
		tc2.start();
	}
}
