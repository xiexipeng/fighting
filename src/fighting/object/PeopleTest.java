package fighting.object;

public class PeopleTest {

	public static void main(String[] args) {
		People p = new People();
		p.name = "xxp";
		p.gender1 = "我不是男的";
//		p.gender2 = "我不是男的";
		p.setGender2("我不是男的");
		
		p.eat();
	}

}

class People {
	String id;
	String name;
	String gender1;
	private String gender2;

	public String getGender2() {
		return gender2;
	}

	public void setGender2(String gender2) {
		if ("男".equals(gender2) || "女".equals(gender2)) {
			this.gender2 = gender2;
		} else {
			System.out.println("请输入\"男\"或者\"女\"");
		}
	}

	public void eat() {
		System.out.println("我是吃货。。。");
	}
}