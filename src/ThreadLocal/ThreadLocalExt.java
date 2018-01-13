package ThreadLocal;

public class ThreadLocalExt extends ThreadLocal {
	@Override
	protected Object initialValue() {
		// TODO Auto-generated method stub
		return "default";
	}
}
