package org.relaxone;

import java.util.ArrayList;

public class FindContnuousSequence {

	public ArrayList<ArrayList<Integer>> findContinuousSequence(int sum) {
		ArrayList<ArrayList<Integer>> result = new ArrayList<>();
		int low = 1, high = 2;
		while (low < high) {
			int tem = (low + high) * (high - low + 1) / 2;
			if (tem == sum) {
				ArrayList<Integer> list = new ArrayList<>();
				int index = low;
				while (index <= high) {
					list.add(index);
					index++;
				}
				result.add(list);
				low++;
			}else if(tem > sum) {
				low++;
			}else {
				high++;
			}
		}

		return result;
	}
	public static void main(String[] args) {
		FindContnuousSequence sequence = new FindContnuousSequence();
		System.out.println(sequence.findContinuousSequence(100));
	}
}
