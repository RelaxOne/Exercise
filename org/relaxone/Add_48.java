package org.relaxone;

/**
 * a. ��������������������֮��
 * b. ���ý�λ����Ӻ͵õ����
 * @author zhoucw
 *
 */
public class Add_48 {
	public int add(int num1, int num2) {
		while (num2 != 0) {
			int temp = num1 ^ num2;	// �õ���λ���֮��
			num2 = (num1 & num2) << 1;	// �õ���λ��λ���
			num1 = temp;
		}
		return num1;
	}
	
	public static void main(String[] args) {
		Add_48 a = new Add_48();
		System.out.println(a.add(111, 899));
	}
}
