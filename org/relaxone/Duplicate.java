package org.relaxone;

public class Duplicate {

	public boolean duplicate(int[] numbers, int length, int[] duplication) {
		for (int i = 0; i < length; i++) {
			for (int j = 0; j < i; j++) {
				if (numbers[j] == numbers[i]) {
					duplication[0] = numbers[j];
					return true;
				}
			}
		}
		return false;
	}
	
	public boolean duplicate_2(int numbers[], int length, int[] duplication) {
		boolean[] temp = new boolean[length];
		for(int i = 0;i<length;i++) {
			if(temp[numbers[i]] == true) {
				duplication[0] = numbers[i];
				return true;
			}else {
				temp[numbers[i]] = true;
			}
		}
		return false;
	}
	
	public static void main(String[] args) {
		int[] numbers = {2,3,1,0,2,5,3};
		int length = numbers.length;
		int[] duplication = new int[1];
		Duplicate duplicate = new Duplicate();
		duplicate.duplicate_2(numbers, length, duplication);
		System.out.println(duplication[0]);
	}
}	
