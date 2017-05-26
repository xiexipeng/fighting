package fighting.collection;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Set;

public class ListTest {

	public static void main(String[] args) {
		ListTest test = new ListTest();
		// List<ListTest> list = new ArrayList<ListTest>();
		// List<ListTest> list2 = new LinkedList<ListTest>();
		// System.out.println(list.add(test));
		// System.out.println(list.add(test));
		// System.out.println(list.size());
		// test.addTest();
//		test.iteratorTest();
		test.listTraversal();
		Hashtable t = new Hashtable();

	}

	public void iterator() {
		List<String> list = new ArrayList<String>();
		Iterator<String> it = list.iterator();
		while (it.hasNext()) {
			String s = it.next();
		}
	}

	public void addTest() {
		List<String> l = new ArrayList<String>();
		l.add("aa");
		l.add("bb");
		System.out.println(l); // 输出[aa, bb]
		l.add(0, "cc");
		System.out.println(l); // 输出[cc, aa, bb]
		l.set(0, "dd");
		System.out.println(l); // 输出[dd, aa, bb]
		l.remove(0);
		System.out.println(l); // 输出[aa, bb]
		List<String> s = l.subList(0, 1);
		System.out.println(s); // 输出[aa]
		List<String> l2 = new ArrayList<String>();
		l2.add("ee");
		l.addAll(0, l2);
		System.out.println(l); // 输出[ee, aa, bb]

	}

	public void iteratorTest() {
		List<String> l = new ArrayList<String>();
		l.add("aa");
		l.add("bb");
		l.add("cc");
		ListIterator<String> lt = l.listIterator();
		while (lt.hasNext()) {
			System.out.println(lt.next());
			lt.remove();
			lt.add("dd");
			// lt.set("dd"); //报错,因为之前已经做了remove操作了
			// l.add("cc"); //报错
		}
		System.out.println(l); // 输出s[dd, dd, dd]
	}

	public void hashTest() {
		Map<String, String> map = new HashMap<String, String>();
		String a = "hash";
		System.out.println(a.hashCode());
		Integer b = 1;
		System.out.println(b.hashCode());
		Boolean c = true;
		System.out.println(c.hashCode());
		ListTest test = new ListTest();
		System.out.println(test.hashCode());
	}

	public void listTraversal() {
		List<Integer> list = new ArrayList<Integer>();
		list.add(1);
		list.add(2);
		list.add(4);
		list.add(6);
		
		for(int i = 0;i<list.size();i++){
			System.out.println(list.get(i));
		}

		Iterator it = list.iterator();
		while (it.hasNext()) {
			int i = (int) it.next();
			System.out.println(i);
		}

		for (int i : list) {
			System.out.println(i);
		}
	}
	
	public void setTest(){
		Set<String> set = new HashSet<String>();
	}
}
