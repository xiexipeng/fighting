package fighting.fanxing;

public class GenericTest3 {
	public static void main(String[] args) {

		// Generic2<Super> genSuper = new Generic2<Super>();
		Sub s1 = new Sub();
		Generic2<Sub> sub = new Generic2<Sub>();
		sub.setTest(s1);
		Generic2<? extends Super> genSuper = new Generic2<Sub>();
		genSuper.getTest().getFirst();
		// genSuper.setTest(new Super());
		// genSuper.setTest(new Sub());
		// genSuper.setTest("");
		Generic2 generic = new Generic2<Super>();
		generic.setTest(new Super());
	}

}

class Generic2<T> {
	private T test;

	public void setTest(T newValue) {
		test = newValue;
	}

	public T getTest() {
		return test;
	}
}

class Super {
	private String first;
	private String second;

	public String getFirst() {
		return first;
	}

	public void setFirst(String first) {
		this.first = first;
	}

	public String getSecond() {
		return second;
	}

	public void setSecond(String second) {
		this.second = second;
	}
}

class Sub extends Super {

}