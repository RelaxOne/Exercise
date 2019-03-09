package org.relaxone;

public class CharStream {

	int[] count = new int[256];
	int index = 1;

	public void Insert(char ch) {
		if (count[ch] == 0)
			count[ch] = index++;
		else
			count[ch] = -1;
	}

	public char FirstApperingOnce() {
		char ch = '#';
		int temp = Integer.MAX_VALUE;
		for (int i = 0; i < count.length; i++) {
			if (count[i] != -1 && count[i] != 0 && count[i] < temp) {
				temp = count[i];
				ch = (char) i;
			}
		}
		return ch;
	}

	public static void main(String[] args) {
		CharStream stream = new CharStream();
		String str = "google";

		for (int i = 0; i < str.length(); i++) {
			for (int j = 0; j <= i; j++) {
				stream.Insert(str.charAt(j));
			}
			System.out.println(stream.FirstApperingOnce());
		}
	}

}
