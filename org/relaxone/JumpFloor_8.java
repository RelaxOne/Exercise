package org.relaxone;
/**
 * a. ������̨�ף�ÿ�ο�����һ�׻������ף���N�׹��ж���������
 * b. F(n) = F(n-1) + F(n-2) ���� F(1) = 1 F(2) = 2
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
