package org.relaxone;

/**
 * a. 判断一个数组是否是一个二叉搜索树的后序遍历序列(任意两个数都不相同)
 * b. 二叉搜索树的前半段小于最后的根节点，后半段都大于根节点。
 * @author zhoucw
 *
 */
public class VerifySquenceOfBST_23 {
	//　判断从 start 到 end 的数组序列是否满足二叉搜索树的条件
	public boolean verifyCore(int[] sequence, int start, int end) {
		if (start >= end)
			return true;
		int gap = start;
		// 循环找到第一个大于根节点的下标
		for (; gap < end; gap++) {
			if (sequence[gap] > sequence[end])
				break;
		}
		//　判断后面的节点是否都是大于根节点
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
