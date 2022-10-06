package com.callor.hello;

public class Class015 {
	
	public static void main(String[] args) {
		String str = "yesterday";
		String[] strs = str.split("");
		System.out.println(strs[0]);
		System.out.println(strs[1]);
		System.out.println(strs[2]);
		
		for(int i = 0 ; i < strs.length ; i++) {
			System.out.println(strs[i]);
		}
		
		// strs 배열에 담긴 문자열을
		// 순서없이 섞기
		for(int i = 0 ; i < 100 ; i++) {
			int index1 = (int)(Math.random() * strs.length);
			int index2 = (int)(Math.random() * strs.length);
			String _str = strs[index1];
			strs[index1] = strs[index2];
			strs[index2] = _str;
		}
		for(int i = 0 ; i < strs.length ; i++) {
			System.out.print(strs[i]);
		}
		
		
	}

}
