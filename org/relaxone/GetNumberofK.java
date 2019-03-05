package org.relaxone;

public class GetNumberofK {
	
	public static int getNumberofK(int[] array, int k) {
		int number = 0,index = 0;
		for(int i = 0;i<array.length; i++) {
			if(array[i] != k) {
				if(i - index > 1)
					return number;
				index = i;
				continue;
			}
			number++;
		}
		return number;
	}
	
	public static void main(String[] args) {
		int[] array  = {1,2,3,3,3,3};
		
		System.out.println(getNumberofK(array, 3));
	}
}
