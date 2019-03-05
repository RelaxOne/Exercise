package org.relaxone;

import java.util.ArrayList;

public class FindNumberAppearOnce {
	
	private static void findNumberAppearOnce(int[] array, int[] num1, int[] num2) {
		ArrayList<Integer> list = new ArrayList<>();
		
		for(int number: array) {
			if(list.contains(Integer.valueOf(number))) {
				list.remove(Integer.valueOf(number));
			}else {
				list.add(Integer.valueOf(number));
			}
		}
		num1[0] = list.get(0).intValue();
		num2[0] = list.get(1).intValue();
	}
	
	public static void tt(int [] array,int num1[] , int num2[]) {
        if(array == null || array.length<2) return;
        int arrXor = 0;
        for(int i: array )
            arrXor ^=i; 
        //异或后的数1出现在第几位
        int indexOf1=0;
        while(((arrXor & 1 )== 0) && indexOf1 <=32){
            arrXor = arrXor >>> 1;
            indexOf1++;
        }
        
        System.out.println("arrXor is:" + arrXor);
        
        for(int i:array){
          boolean isBit1= ((i >>> indexOf1)& 1) ==0;
          //根据第k位是1还是0来分组
          
          System.out.println(" isBit1 is :" + isBit1);
          
          if(isBit1){
              num1[0] ^=i;
          }else{
              num2[0] ^=i;
          }
        }
     
    }
	
	public static void main(String[] args) {
		int[] array = {1,2,3,4,5,6,4,3,2,1};
		int[] num1 = new int[1];
		int[] num2 = new int[1];
		
		tt(array, num1, num2);
		System.out.println(num1[0] + " " + num2[0]);
	}
	
}
