package org.relaxone;

/**
 * a. �� 1-n �������� 1 ���ֵĸ���
 * b. ������ת�����ַ�������ȡ�ַ���1 ��ͳ����ĸ���
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
