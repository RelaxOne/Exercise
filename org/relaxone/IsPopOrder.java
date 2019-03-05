package org.relaxone;

import java.util.Stack;

public class IsPopOrder {

	private static boolean IsPopOrder(int[] pushA, int[] popA) {
		if (pushA.length == 0 || popA.length == 0 || pushA == null || popA == null || pushA.length != popA.length)
			return false;
		int popIndex = 0;
		Stack<Integer> tempStack = new Stack<>();
		for(int i=0;i<popA.length;i++) {
			tempStack.push(Integer.valueOf(pushA[i]));
			while(!tempStack.isEmpty() && tempStack.peek() == popA[popIndex]) {
				popIndex++;
				tempStack.pop();
			}
		}
		return tempStack.empty();
	}

	public static void main(String[] args) {
		int[] pushA = {1,2,3,4,5};
		int[] popA = {4,5,3,2,1};
		System.out.println(IsPopOrder(pushA, popA));
	}
}
