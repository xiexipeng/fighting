package fighting.object;

public class Person {
	
	public int i;
	
	 public static int j=1;
//	
//	public void Person(){
//		
//	}
	{
		System.out.println("aaaaa");
	}

	static{
		System.out.println("bbbbb");
//		System.out.println(i);		报错，i应该是static
//		test1();	报错
	}
	public Person(){
//		j = 0;
		System.out.println(22222);
	}
	
	public Person(int i){
//		j = 0;
		System.out.println(22222);
	}
	
	public static void main(String args[]){
		System.out.println(11111);
		Person p = new Person();
		Test t = new Test(1);
		System.out.println(t.i);
		Person p1 = new Test();
		System.out.println(p.j);
	}
	
	public void test1(int j){
		int i;
	}
	
	public void test2(){
		int i;
	}
	

}

class Test extends Person{
	int i;
	public int j=2;
	public Test(int i) {
//		super(i);
//		Person p = new Person(1);
		// TODO Auto-generated constructor stub
	}
//	public Test(String a){
//		
//	}
	
	public Test() {
		// TODO Auto-generated constructor stub
		this(1);
	}

	@Override
	public void test1(int a){
	}

}
