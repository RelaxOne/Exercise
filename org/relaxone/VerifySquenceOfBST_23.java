package org.relaxone;

/**
 * a. �ж�һ�������Ƿ���һ�������������ĺ����������(����������������ͬ)
 * b. ������������ǰ���С�����ĸ��ڵ㣬���ζ����ڸ��ڵ㡣
 * @author zhoucw
 *
 */
public class VerifySquenceOfBST_23 {
	//���жϴ� start �� end �����������Ƿ��������������������
	public boolean verifyCore(int[] sequence, int start, int end) {
		if (start >= end)
			return true;
		int gap = start;
		// ѭ���ҵ���һ�����ڸ��ڵ���±�
		for (; gap < end; gap++) {
			if (sequence[gap] > sequence[end])
				break;
		}
		//���жϺ���Ľڵ��Ƿ��Ǵ��ڸ��ڵ�
		for (int i = gap; i < end; i++) {
			if (sequence[i] < sequence[end])
				return false;
		}
		return verifyCore(sequence, start, gap - 1) && verifyCore(sequence, gap, end - 1);
	}

	public boolean verifySquenceOfBST(int[] sequence) {
		if (sequence == null || sequence.length == 0)
			return false;
		return verifyCore(sequence, 0, sequence.length - 1);
	}
}
