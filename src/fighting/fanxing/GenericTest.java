package fighting.fanxing;

import java.util.ArrayList;
import java.util.List;

public class GenericTest {

	public static void main(String[] args) {
		List list = new ArrayList();
		list.add("aa");
		list.add("bb");

		for (int i = 0; i < list.size(); i++) {
			String s = (String) list.get(i); // ͨ��list���ϻ�ȡ����ʱ��Ҫǿ��ת��ΪString����
		}

		list.add(1111);
	}

}
