package fighting.string;

import java.lang.reflect.Field;

import fighting.object.Person;

public class StringTest {
	
	public static String changString(String s){
		String r = s.toUpperCase();
		return r;
	}

	public static void main(String[] args) {
		String a = "hello";
		System.out.println(a);			//hello
		String b = changString(a);
		System.out.println(b);			//HELLO
		a = "nihao";
		System.out.println(a);			//nihao
		
		String c = "xx" + "yy" + "abc";
		System.out.println(c);
		String[] s = {"a","b","c"};
		String r = "";
//		StringBuilder r = new StringBuilder();
		for(int i =0;i<3;i++){
			r+=s[i];
		}
		StringTest st = new StringTest();
		try {
			st.stringReflection();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Person p = new Person(1);
		p.i=0;
	}
	public static void stringReflection() throws Exception {

	    String s = "Hello World";

	    System.out.println("s = " + s); //Hello World

	    //��ȡString���е�value�ֶ�
	    Field valueField = String.class.getDeclaredField("value");

	    //�ı�value���Եķ���Ȩ��
	    valueField.setAccessible(true);

	    char[] value = (char[]) valueField.get(s);

	    //�ı�value�����õ������еĵ�5���ַ�
	    value[5] = '_';

	    System.out.println("s = " + s); //Hello_World
	}

}
