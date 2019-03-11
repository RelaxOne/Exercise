package org.relaxone;
/**
 * a. 青蛙跳台阶，每次可以跳一阶或者两阶，求N阶共有多少种跳法
 * b. F(n) = F(n-1) + F(n-2) 其中 F(1) = 1 F(2) = 2
 * @author zhoucw
 *
 */
public class JumpFloor_8 {
	public int jumpfloor(int target) {
		if(target == 1)
			return 1;
		if(target== 2)
			return 2;
		
		return jumpfloor(target-1) + jumpfloor(target-2);
	}
	
	public static void main(String[] args) {
		JumpFloor_8 floor = new JumpFloor_8();
		System.out.println(floor.jumpfloor(3));
	}
}
