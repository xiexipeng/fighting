package fighting.object;

public class PeopleTest {

	public static void main(String[] args) {
		People p = new People();
		p.name = "xxp";
		p.gender1 = "�Ҳ����е�";
//		p.gender2 = "�Ҳ����е�";
		p.setGender2("�Ҳ����е�");
		
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
		if ("��".equals(gender2) || "Ů".equals(gender2)) {
			this.gender2 = gender2;
		} else {
			System.out.println("������\"��\"����\"Ů\"");
		}
	}

	public void eat() {
		System.out.println("���ǳԻ�������");
	}
}