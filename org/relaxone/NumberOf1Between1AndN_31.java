package org.relaxone;

/**
 * a. 求 1-n 的整数中 1 出现的个数
 * b. 将数字转换成字符串后提取字符串1 并统计其的个数
 * @author zhoucw
 *
 */
public class NumberOf1Between1AndN_31 {
	public int numberof1Between1AndN(int n) {
		if (n <= 0)
			return 0;
		int result = 0;
		for (int i = 0; i < n; i++) {
			String numberStr = String.valueOf(i);
			char[] charArray = numberStr.toCharArray();
			for (int j = 0; j < charArray.length; j++) {
				if (charArray[j] == '1')
					result++;
			}
		}
		return result;
	}
}
