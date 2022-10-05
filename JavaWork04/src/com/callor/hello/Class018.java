package com.callor.hello;

public class Class018 {
	
	public static void main(String[] args) {
		int result = even(3);
		if(result == 1) {
			System.out.println("짝수");
		} else {
			System.out.println("홀수");
		}
	}
	/*
	 * num 변수에 정수값을 전달받아서
	 * num 변수에 저장된 값이
	 * 		짝수이면 1을 return
	 * 		홀수이면 0을 return
	 */
	public static int even(int num) {
		if(num % 2 == 0) {
			return 1;
		} else {
			return 0;
		}
	}

}
