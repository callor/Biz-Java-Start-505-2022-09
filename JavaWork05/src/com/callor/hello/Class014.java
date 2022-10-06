package com.callor.hello;

public class Class014 {
	
	public static void main(String[] args) {
		
		String str = "Republic of Korea";
		// str 문자열 변수에 저장된 문자열을
		// " " 를 기준으로 잘라서
		// 문자열 배열로 만들고
		// strs 문자열 배열에 저장해 준다
		String[] strs = str.split(" ");
		System.out.println(strs[0]);
		System.out.println(strs[1]);
		System.out.println(strs[2]);
		
	}

}
