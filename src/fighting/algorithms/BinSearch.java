package fighting.algorithms;

import java.util.List;

public class BinSearch {

	// 在区间[lo,hi)的范围内查找元素num，其中0<=lo<=hi<=list.size()
	public int search1(List<Integer> list, int num, int lo, int hi) {
		while (lo < hi) {
			int r = (lo + hi) / 2;
			if (list.get(r) < num) {
				hi = r;
			} else if (num < list.get(r)) {
				lo = r + 1;
			} else {
				return list.get(r);
			}
		}
		return -1;
	}//T(n) = T(n/2) + O(1) = O(logn),几何级数递减

}
