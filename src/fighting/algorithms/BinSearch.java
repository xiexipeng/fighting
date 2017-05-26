package fighting.algorithms;

import java.util.List;

public class BinSearch {

	// ������[lo,hi)�ķ�Χ�ڲ���Ԫ��num������0<=lo<=hi<=list.size()
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
	}//T(n) = T(n/2) + O(1) = O(logn),���μ����ݼ�

}
