package OneProvider2OneConsumerStack;

public class P {
	private MyStack stack;

	public P(MyStack stack) {
		super();
		this.stack = stack;
	}
	
	public void pushService() {
		stack.push();
	}

}
