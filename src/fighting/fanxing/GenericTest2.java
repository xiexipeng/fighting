package fighting.fanxing;

public class GenericTest2 {

	public static void main(String[] args) {
		Generic<String> g = new Generic<String>("hello");
		System.out.println(g.getTest());
	}

}

class Generic<T extends Comparable> {
	private T test;

	public Generic(T test) {
		this.test = test;
	}

	public void setTest(T newValue) {
		test = newValue;
	}

	public T getTest() {
		return test;
	}

	public T max(T a, T b) {
		if (a.compareTo(b) > 0) {
			return a;
		}
		return b;
	}

}
