package org.relaxone;

public class JumpFloor {
	public int jumpfloor(int target) {
		if(target == 1)
			return 1;
		if(target== 2)
			return 2;
		
		return jumpfloor(target-1) + jumpfloor(target-2);
	}
	
	public int jumpfloorII(int target) {
		if(target == 0)
			return 1;
		int count = 0;
		for(int i = 1; i<= target;i++)
			count += jumpfloorII(target-i);
		return count;
	}
	
	public int RectCover(int target) {
		if(target <= 0)
			return 0;
		if(target == 1 || target == 2)
			return 1;
		else
			return RectCover(target-1)+ RectCover(target-2);
	}
	
	public static void main(String[] args) {
		JumpFloor floor = new JumpFloor();
		System.out.println(floor.jumpfloorII(3));
	}
}
