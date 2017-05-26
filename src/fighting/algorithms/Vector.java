package fighting.algorithms;

import java.util.List;

public class Vector {

	// �ж������Ƿ�����������
	public int disordered(int[] a) {// ������������������Ԫ�صĸ���
		int n = 0;
		for (int i = 1; i < a.length; i++) {
			if (a[i - 1] > a[i])// ��һ���������Ԫ��
				n++;// ��������������+1
		}
		return n;
	}

	// ����Ԫ��Ψһ��
	public int uniquify(List<Integer> a) {
		int oldSize = a.size();
		int i = 1; // �Ա��ڵ�һ��Ԫ�أ���ʼԪ��Ϊ�ڶ������±�Ϊ1
		while (i < a.size()) { // �����ж�����Ԫ�صĴ�С
			if (a.get(i - 1) == a.get(i)) { // �����ͬ����ɾ����Ԫ�أ�����ת����һ��Ԫ��
				a.remove(i); // �Ƴ���Ԫ�أ�����Ԫ����ǰ��һλ��iָ���Ԫ�صĺ�һ��Ԫ��
			} else {
				i++;
			}
		}
		return oldSize - a.size(); // ���ر�ɾ��Ԫ�صĸ���
	}

	// ����Ԫ��Ψһ���Ľ��㷨
	public int uniquify2(List<Integer> a) {
		int i = 0;
		int j = 0;
		while (++j < a.size()) { // ���������е�����Ԫ��
			if (a.get(i) != a.get(j)) { // �����ͬ��ֱ��������Ԫ��
				a.add(++i, a.get(j)); // ���򽫸�Ԫ�����������Ԫ�صĺ�һλ
			}
		}
		a = a.subList(0, i + 1); // ��ȡ��β�������Ԫ��
		return j - i; // ���ر�ɾ��Ԫ�صĸ���
	}
}
