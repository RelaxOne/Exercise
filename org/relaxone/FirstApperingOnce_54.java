package org.relaxone;

/**
 * a. �����ַ����е�һ�����ظ����ַ�
 * b. ����һ���ַ������¼ÿ���ַ�������ֵ�λ��
 * @author zhoucw
 *
 */
public class FirstApperingOnce_54 {

	int[] count = new int[256];
	int index = 1;

	public void Insert(char ch) {
		if (count[ch] == 0)
			count[ch] = index++;// ���û�����ַ����ֵ�λ��
		else
			count[ch] = -1;
	}

	public char firstApperingOnce() {
		char ch = '#';
		int temp = Integer.MAX_VALUE;
		// �ҵ��ַ��д��� 0 ������λ����С��ֵ���±꼴Ϊ���ȳ��ֵĲ��ظ��ַ�
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
