package org.relaxone;

/**
 * a. 查找字符流中第一个不重复的字符
 * b. 利用一个字符数组记录每个字符最近出现的位置
 * @author zhoucw
 *
 */
public class FirstApperingOnce_54 {

	int[] count = new int[256];
	int index = 1;

	public void Insert(char ch) {
		if (count[ch] == 0)
			count[ch] = index++;// 设置或更新字符出现的位置
		else
			count[ch] = -1;
	}

	public char firstApperingOnce() {
		char ch = '#';
		int temp = Integer.MAX_VALUE;
		// 找到字符中大于 0 并且其位置最小的值得下标即为最先出现的不重复字符
		for (int i = 0; i < count.length; i++) {
			if (count[i] != -1 && count[i] != 0 && count[i] < temp) {
				temp = count[i];
				ch = (char) i;
			}
		}
		return ch;
	}

	public static void main(String[] args) {
		FirstApperingOnce_54 stream = new FirstApperingOnce_54();
		String str = "google";

		for (int i = 0; i < str.length(); i++) {
			for (int j = 0; j <= i; j++) {
				stream.Insert(str.charAt(j));
			}
			System.out.println(stream.firstApperingOnce());
		}
	}

}
