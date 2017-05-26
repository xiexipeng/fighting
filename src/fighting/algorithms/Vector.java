package fighting.algorithms;

import java.util.List;

public class Vector {

	// 判断向量是否是有序向量
	public int disordered(int[] a) {// 返回向量中逆序相邻元素的个数
		int n = 0;
		for (int i = 1; i < a.length; i++) {
			if (a[i - 1] > a[i])// 逐一检查相邻两元素
				n++;// 如果逆序则计数器+1
		}
		return n;
	}

	// 向量元素唯一化
	public int uniquify(List<Integer> a) {
		int oldSize = a.size();
		int i = 1; // 对比于第一个元素，起始元素为第二个，下标为1
		while (i < a.size()) { // 依次判断相邻元素的大小
			if (a.get(i - 1) == a.get(i)) { // 如果相同，则删除该元素，否则转至后一个元素
				a.remove(i); // 移除该元素，所有元素往前移一位，i指向该元素的后一个元素
			} else {
				i++;
			}
		}
		return oldSize - a.size(); // 返回被删除元素的个数
	}

	// 向量元素唯一化改进算法
	public int uniquify2(List<Integer> a) {
		int i = 0;
		int j = 0;
		while (++j < a.size()) { // 便利集合中的所有元素
			if (a.get(i) != a.get(j)) { // 如果相同，直接跳过该元素
				a.add(++i, a.get(j)); // 否则将该元素移至其紧邻元素的后一位
			}
		}
		a = a.subList(0, i + 1); // 截取掉尾部多余的元素
		return j - i; // 返回被删除元素的个数
	}
}
