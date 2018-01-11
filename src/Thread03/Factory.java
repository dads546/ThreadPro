package Thread03;

public class Factory {
	
	public static int size;

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		Factory.size = size;
	}
	
	synchronized public void addSize() {
		Factory.size++;
	}

}
