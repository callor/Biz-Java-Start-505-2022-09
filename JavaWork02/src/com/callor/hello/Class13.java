package com.callor.hello;

public class Class13 {
	
	public static void main(String[] args) {
		
		/*
		 * do while() 반복문
		 * while() 반복문은 무조건 조건 검사를 한번
		 * 수행하는데
		 * do while() 반복문은
		 * 조건 검사를 do 코드가 한번 실행되고 나서
		 * 수행한다.
		 */
		int num1 = 0;
		do {
			num1 = (int)(Math.random() * 100) + 1;
			System.out.println(num1);
		} while(num1 % 5 != 0) ;
	}

}
