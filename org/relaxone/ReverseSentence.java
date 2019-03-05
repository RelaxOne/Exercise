package org.relaxone;

public class ReverseSentence {
	public static String reverseSentence(String str) {
		
		String result = "";
		if(str == null){ return null;}
        if(str.trim().equals("")){
           return str;
       }
		String[] list = str.split(" ");
		if(list.length ==  0)
            return " ";
		for(int i = list.length-1 ; i > 0 ; i--) {
			result += list[i] + " ";
		}
		result += list[0];
		
		return result;
	}
	
	public static void main(String[] args) {
		String str = " ";
		System.out.println(reverseSentence(str));
	}
}
