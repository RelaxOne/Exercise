package org.relaxone;
/**
 * a. ���ܱ�̬��̨�ף�һ�ο����� n ��
 * b. 
 * @author zhoucw
 *
 */
public class JumpFloorII_9 {
	
	public int jumpfloorII(int target) {
		if(target == 0)
			return 1;
		int count = 0;
		for(int i = 1; i<= target;i++)
			count += jumpfloorII(target-i);
		return count;
	}
	public static void main(String[] args) {
		JumpFloorII_9 floorII_9 = new JumpFloorII_9();
		System.out.println(floorII_9.jumpfloorII(3));
	}
	
}
