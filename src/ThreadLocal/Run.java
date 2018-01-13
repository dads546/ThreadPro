package ThreadLocal;

public class Run {
	public static ThreadLocal t1 = Tools.t1;
	public static void main(String[] args) {
		System.out.println(t1.get());
		if(t1.get()==null) {
			System.out.println("´ÓÎ´¸³¹ýÖµ");
			t1.set("ssxl");
		}
		System.out.println(t1.get());
		System.out.println(t1.get());
	}
}
