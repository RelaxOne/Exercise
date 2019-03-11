package org.relaxone;

/**
 * a. 正则表达式的匹配
 * b. 将字符串分为两种情况讨论，
 *     (1)模式一个字符串和匹配字符串第一个字符相同但模式字符串第二个字符是 *
 *     (2)模式一个字符串和匹配字符串第一个字符相同但模式字符串第二个字符不是 * 
 * @author zhoucw
 *
 */
public class Match_52 {
	public boolean match(char[] str, char[] pattern) {
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
		// 模式第一个字符跟字符串第一个字符匹配并且模式字符串第二个是 *
		if (patternIndex + 1 < pattern.length && pattern[patternIndex + 1] == '*') {
			if ((strIndex < str.length && pattern[patternIndex] == str[strIndex])
					|| (pattern[patternIndex] == '.' && strIndex < str.length)) {
				return mathCore(str, strIndex, pattern, patternIndex + 2)
						|| mathCore(str, strIndex + 1, pattern, patternIndex + 2)
						|| mathCore(str, strIndex + 1, pattern, patternIndex);
			} else {
				// 模式不匹配, 模式向后移动两位
				return mathCore(str, strIndex, pattern, patternIndex + 2);
			}
		}
		// 模式第一个字符跟字符串第一个字符匹配并且模式字符串第二个不是 * 的情况,
		if ((strIndex != str.length && pattern[patternIndex] == str[strIndex])
				|| pattern[patternIndex] == '.' && strIndex != str.length)
			return mathCore(str, strIndex + 1, pattern, patternIndex + 1);
		return false;
	}
}
