package org.relaxone;

/**
 * a. �� 2*n �Ĵ������ 2*1��С���θ��ǵĲ�ͬ�Ƿ�
 * b. F(1) = 1 F(2) = 1 F(3) = 2 F(4) = 3 F(5) = 5 ...
 * @author zhoucw
 *
 */
public class RectCover_10 {
	
	public int rectCover(int target) {
		if(target <= 0)
			return 0;
		if(target == 1 || target == 2)
			return 1;
		else
			return rectCover(target-1) + rectCover(target-2);
	}
	
	public static void main(String[] args) {
		RectCover_10 cover_10 = new RectCover_10();
		System.out.println(cover_10.rectCover(10));
	}
	
}
