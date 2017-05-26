package fighting.fanxing;

import java.util.ArrayList;
import java.util.List;

public class GenericTest {

	public static void main(String[] args) {
		List list = new ArrayList();
		list.add("aa");
		list.add("bb");

		for (int i = 0; i < list.size(); i++) {
			String s = (String) list.get(i); // 通过list集合获取对象时需要强制转换为String类型
		}

		list.add(1111);
	}

}
