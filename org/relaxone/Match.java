package org.relaxone;

public class Match {
	public boolean matcha(char[] str, char[] pattern) {

		if (str == null || pattern == null)
			return false;

		int strIndex = 0;
		int patternIndex = 0;

		return mathCore(str, strIndex, pattern, patternIndex);
	}

	public boolean mathCore(char[] str, int strIndex, char[] pattern, int patternIndex) {
		if (strIndex == str.length && patternIndex == pattern.length)
			return true;
		if (patternIndex == pattern.length && strIndex != str.length)
			return false;
		// ģʽ��һ���ַ����ַ�����һ���ַ�ƥ�䲢��ģʽ�ַ����ڶ����� *
		if (patternIndex + 1 < pattern.length && pattern[patternIndex + 1] == '*') {
			if ((strIndex < str.length && pattern[patternIndex] == str[strIndex])
					|| (pattern[patternIndex] == '.' && strIndex < str.length)) {
				return mathCore(str, strIndex, pattern, patternIndex + 2)
						|| mathCore(str, strIndex + 1, pattern, patternIndex + 2)
						|| mathCore(str, strIndex + 1, pattern, patternIndex);
			} else {
				// ģʽ��ƥ��, ģʽ����ƶ���λ
				return mathCore(str, strIndex, pattern, patternIndex + 2);
			}
		}
		// ģʽ��һ���ַ����ַ�����һ���ַ�ƥ�䲢��ģʽ�ַ����ڶ������� * �����,
		if ((strIndex != str.length && pattern[patternIndex] == str[strIndex])
				|| pattern[patternIndex] == '.' && strIndex != str.length)
			return mathCore(str, strIndex + 1, pattern, patternIndex + 1);
		return false;
	}
}
